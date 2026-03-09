# 📚 Estructuras de Datos — Pilas (Stacks)

## ¿Qué es una Pila?

Una **pila** es una estructura de datos lineal basada en el principio **LIFO** (*Last In, First Out*): el último elemento en ingresar es el primero en salir.

> 💡 Se puede pensar como una pila de platos: solo puedes agregar o retirar el plato que  está en la parte de arriba.

### Operaciones fundamentales

| Operación | Descripción |
|-----------|-------------|
| `push(x)` | Agrega un elemento al tope de la pila |
| `pop()` | Elimina y retorna el elemento de la cima |
| `peek()` | Consulta el contenido de la cima |
| `isEmpty()` | Verifica si la pila está vacía |

---

## 🔄 Aplicación: Undo / Redo

Para implementar las funcionalidades de **deshacer** y **rehacer**, se utilizan **dos pilas**:

- **`undoStack`** → almacena cada acción realizada por el usuario.
- **`redoStack`** → almacena las acciones que fueron deshechas.

### Reglas de comportamiento

- Cada vez que el usuario realiza una **acción**, esta se añade a la cima de `undoStack` y `redoStack` se vacía.
- Al ejecutar **undo**, se extrae la acción de la cima de `undoStack` y se agrega a `redoStack`.
- Al ejecutar **redo**, se extrae la acción de la cima de `redoStack` y se regresa a `undoStack`.

### Ejemplo — Editor de texto

```
// Estado inicial
undoStack: []
redoStack: []

// Acción 1 - Escribir ---> "Hola"
undoStack: ["Hola"]
redoStack: []

// Acción 1 - Escribir ---> " Cómo estás?"
undoStack: ["Hola", " Cómo estás?"]
redoStack: []

// Acción 2 - deshacer ---> se deshace " Cómo estás?"
undoStack: ["Hola"] // Se hace pop sobre undoStack y se hace push sobre redoStack
redoStack: [" Cómo estás?"]

// Acción 2 - deshacer  ---> se deshace "Hola"
undoStack: [] // Se hace pop sobre undoStack y se hace push sobre redoStack nuevamente
redoStack: [" Cómo estás?", "Hola"]

// Acción 3 - rehacer ---> se rehace "Hola"
undoStack: ["Hola"] // En este caso se rehace Hola porque es lo que está en la cima de redoStack
redoStack: [" Cómo estás?"]

// Acción 1 - Escribir ---> "Adiós" ---> redoStack se limpia
undoStack: ["Hola", "Adiós"]
redoStack: []
```

> ⚠️ **Nota sobre este programa:** en este programa, en lugar de almacenar acciones individuales, se guarda el **estado completo del texto concatenado** en cada entrada de la pila. Esto simplifica la visualización del contenido en pantalla.

---

## 🏗️ Estructura del Proyecto

```
📁 Actividad-Pilas-Stack
├── src                 
└── README.md
```

---

## ▶️ Ejecución del Programa

Se inicia el projecto en intellij, desplegando el menú del editor de texto:

<img width="752" height="209" alt="image" src="https://github.com/user-attachments/assets/c833ba14-d8b9-41ff-b98a-1ff4fec807d8" />

Se selecciona la opcion 1 para agregar nuevo texto al editor:

<img width="1778" height="213" alt="image" src="https://github.com/user-attachments/assets/ad0d029b-7d46-4b94-bdfb-a62529def4f0" />

Se agrega una nueva sección de texto seleccionando la opción 1:

<img width="494" height="191" alt="image" src="https://github.com/user-attachments/assets/cdbcf65f-6411-4bbe-83f7-a18716d6741a" />

Seleccionamos la opción 4 para revisar el texto usando la funcionalidad del método peek:

<img width="433" height="156" alt="image" src="https://github.com/user-attachments/assets/84301843-9142-4fcb-b880-5ad2c2b278bd" />

Se agrega más texto con la opción 1:

<img width="443" height="196" alt="image" src="https://github.com/user-attachments/assets/7f6f60c7-9dd4-4da9-97dd-5e78c701e10b" />

Se aplica la opción 2 para deshacer el último cambio:

<img width="448" height="152" alt="image" src="https://github.com/user-attachments/assets/3d4d02b9-fd5d-46fc-bf84-169dbeb0917a" />

Revisamos el texto actual con la opción 4, como podemos observar la última cadena de texto ya no está presente(" espero que bien"):

<img width="453" height="171" alt="image" src="https://github.com/user-attachments/assets/7e2a209a-7563-4d17-aadb-db47970e0536" />

Aplicamos la opcion 3 para rehacer el cambio anterior:

<img width="453" height="151" alt="image" src="https://github.com/user-attachments/assets/96f3ede1-b4d0-42cb-b475-980d479f8055" />

Mostramos el texto actual con opción 4:

<img width="508" height="171" alt="image" src="https://github.com/user-attachments/assets/a1d3a744-549e-41b4-b73e-ad13bf3305eb" />

Salimos del aplicativo con opción 5:

<img width="509" height="204" alt="image" src="https://github.com/user-attachments/assets/5062a8d2-5532-45cb-84b2-1abb6fc68181" />

## 👤 Autor

David Fernando González Gallego

IuDígital de Antioquia











#
