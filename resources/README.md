![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Semana 7 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Nicolas Salgado
- **Sección:** 2026_202_OL_PRY2202_24613393_PCT
- **Carrera:** Ingeniería en Informática
- **Sede:** Antonio Varas

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la actividad sumativa de la Semana 7 de la asignatura Desarrollo Orientado a Objetos I. Es la continuación del sistema desarrollado para la agencia de turismo Llanquihue Tour, donde esta semana se aplica **polimorfismo** y **colecciones genéricas** sobre la jerarquía de servicios turísticos creada en la Semana 6 (`ServicioTuristico`, `RutaGastronomica`, `PaseoLacustre`, `ExcursionCultural`).

Se incorporó el método `mostrarInformacion()`, sobrescrito en cada subclase, y una colección `List<ServicioTuristico>` que permite almacenar y recorrer dinámicamente distintos tipos de servicios, invocando el comportamiento correcto de cada uno mediante referencias del tipo de la superclase.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── ui/      # Clase principal con el método main
├── model/   # Clases de dominio (Tour, GuiaTuristico, Direccion, ServicioTuristico, RutaGastronomica, PaseoLacustre, ExcursionCultural)
└── data/    # Clases para la carga/creación de datos (GestorDatos, GestorServicios)
```

## 🧩 Paquetes y clases implementadas

| Clase | Paquete | Descripción |
|---|---|---|
| `ServicioTuristico` | `model` | Superclase con atributos comunes `nombre`, `duracionHoras` y método `mostrarInformacion()` |
| `RutaGastronomica` | `model` | Subclase de `ServicioTuristico`, agrega `numeroDeParadas` y sobrescribe `mostrarInformacion()` |
| `PaseoLacustre` | `model` | Subclase de `ServicioTuristico`, agrega `tipoEmbarcacion` y sobrescribe `mostrarInformacion()` |
| `ExcursionCultural` | `model` | Subclase de `ServicioTuristico`, agrega `lugarHistorico` y sobrescribe `mostrarInformacion()` |
| `GestorServicios` | `data` | Crea una colección `List<ServicioTuristico>` con al menos 5 instancias combinando las distintas subclases |
| `Main` | `ui` | Recorre la colección con for-each e invoca `mostrarInformacion()` de forma polimórfica |
| `Tour` | `model` | *(Semana 5)* Representa un tour con nombre, tipo, reservas, guía y dirección |
| `GuiaTuristico` | `model` | *(Semana 5)* Representa el guía asignado a un tour |
| `Direccion` | `model` | *(Semana 5)* Representa la dirección donde se realiza el tour |
| `GestorDatos` | `data` | *(Semana 5)* Lee el archivo `tours.txt` y construye la lista de objetos Tour |

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/nicosalgadogit/LlanquihueTourApp.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java` desde el paquete `ui`. Se recorrerá la colección de servicios turísticos creada en `GestorServicios` y se mostrará por consola la información de cada uno mediante `mostrarInformacion()`, aplicando polimorfismo (cada subclase imprime su propia información específica).

---

**Repositorio GitHub:** \[https://github.com/nicosalgadogit/LlanquihueTourApp]
**Fecha de entrega:** \[fecha de entrega semana 7]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I