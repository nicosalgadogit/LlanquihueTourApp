![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Semana 8 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Nicolas Salgado
- **Sección:** 2026_202_OL_PRY2202_24613393_PCT
- **Carrera:** Ingeniería en Informática
- **Sede:** Antonio Varas

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la actividad sumativa de la Semana 8 de la asignatura Desarrollo Orientado a Objetos I. Es la continuación del sistema desarrollado para la agencia de turismo Llanquihue Tour, donde esta semana se incorpora la interfaz `Registrable`, nuevas entidades del sistema (`Vehiculo`, `ColaboradorExterno`), y se actualiza `GuiaTuristico` para implementarla también.

Se creó la clase `GestorEntidades`, que administra una colección `ArrayList<Registrable>` con distintos tipos de entidades, recorriéndola de forma polimórfica e identificando el tipo real de cada objeto mediante `instanceof` para aplicar lógica específica según corresponda. Además, se incorporó una interfaz gráfica (`JFrame`) que permite registrar nuevas entidades (guías y vehículos) y visualizar el resumen de todas las registradas.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── ui/      # Clase principal con el método main y la interfaz gráfica (JFrame)
├── model/   # Clases de dominio: Tour, GuiaTuristico, Direccion, ServicioTuristico,
│            # RutaGastronomica, PaseoLacustre, ExcursionCultural,
│            # Registrable (interfaz), Vehiculo, ColaboradorExterno
└── data/    # Clases de gestión: GestorDatos, GestorServicios, GestorEntidades
```

## 🧩 Paquetes y clases implementadas

| Clase / Interfaz | Paquete | Descripción |
|---|---|---|
| `Registrable` | `model` | Interfaz que declara el método `mostrarResumen()`, implementado por las entidades del sistema |
| `GuiaTuristico` | `model` | Implementa `Registrable`. Representa al guía asignado a un tour |
| `Vehiculo` | `model` | Implementa `Registrable`. Representa un vehículo usado para el traslado en los tours |
| `ColaboradorExterno` | `model` | Implementa `Registrable`. Representa a un proveedor externo de servicios para la agencia |
| `GestorEntidades` | `data` | Administra una colección `ArrayList<Registrable>`, recorriéndola y diferenciando tipos con `instanceof` |
| `Main` | `ui` | Ejecuta el programa, muestra los datos en consola y despliega la interfaz gráfica (`JFrame`) para registrar entidades |
| `ServicioTuristico` | `model` | *(Semana 6-7)* Superclase de los servicios turísticos, con `mostrarInformacion()` |
| `RutaGastronomica` | `model` | *(Semana 6-7)* Subclase de `ServicioTuristico`, agrega `numeroDeParadas` |
| `PaseoLacustre` | `model` | *(Semana 6-7)* Subclase de `ServicioTuristico`, agrega `tipoEmbarcacion` |
| `ExcursionCultural` | `model` | *(Semana 6-7)* Subclase de `ServicioTuristico`, agrega `lugarHistorico` |
| `GestorServicios` | `data` | *(Semana 6-7)* Crea una colección `List<ServicioTuristico>` con instancias de las 3 subclases |
| `Tour` | `model` | *(Semana 5)* Representa un tour con nombre, tipo, reservas, guía y dirección |
| `Direccion` | `model` | *(Semana 5)* Representa la dirección donde se realiza el tour |
| `GestorDatos` | `data` | *(Semana 5)* Lee el archivo `tours.txt` y construye la lista de objetos Tour |

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/nicosalgadogit/LlanquihueTourApp.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java` desde el paquete `ui`.

4. Por consola se mostrarán los servicios turísticos y las entidades registrables iniciales (con validación de tipo mediante `instanceof`).

5. Se abrirá una ventana gráfica ("Llanquihue Tour") con las siguientes opciones:
    - **Registrar Guía Turístico:** abre un formulario para ingresar nombre, cargo y años de experiencia.
    - **Registrar Vehículo:** abre un formulario para ingresar patente, tipo de vehículo y capacidad de pasajeros.
    - **Mostrar todas las entidades:** despliega un resumen con todas las entidades registradas (iniciales + las agregadas por el usuario).
    - **Salir:** cierra el programa.

---

**Repositorio GitHub:** \[https://github.com/nicosalgadogit/LlanquihueTourApp] 
**Video de presentación:** \[link del video Kaltura]
**Fecha de entrega:** \[fecha de entrega semana 8]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I