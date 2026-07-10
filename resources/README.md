![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Semana 6 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Nicolas Salgado
- **Sección:** 2026_202_OL_PRY2202_24613393_PCT
- **Carrera:** Ingeniería en Informática
- **Sede:** Antonio Varas

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la actividad sumativa de la Semana 6 de la asignatura Desarrollo Orientado a Objetos I. Se trata de un sistema orientado a objetos desarrollado en Java para la agencia de turismo Llanquihue Tour, cuyo objetivo esta semana es representar jerárquicamente los distintos tipos de servicios turísticos que ofrece la empresa (rutas gastronómicas, paseos lacustres y excursiones culturales), aplicando **herencia simple**, uso de `super()` y sobrescritura de `toString()`.

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
| `ServicioTuristico` | `model` | Superclase con atributos comunes `nombre` y `duracionHoras` |
| `RutaGastronomica` | `model` | Subclase de `ServicioTuristico`, agrega `numeroDeParadas` |
| `PaseoLacustre` | `model` | Subclase de `ServicioTuristico`, agrega `tipoEmbarcacion` |
| `ExcursionCultural` | `model` | Subclase de `ServicioTuristico`, agrega `lugarHistorico` |
| `GestorServicios` | `data` | Crea instancias de prueba de cada subclase de servicio turístico |
| `Main` | `ui` | Ejecuta el programa y muestra los servicios turísticos por consola |
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

3. Ejecuta el archivo `Main.java` desde el paquete `ui`. Se mostrarán por consola las instancias de `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural` creadas en `GestorServicios`, cada una con su información completa mediante `toString()`.

---

**Repositorio GitHub:** \[https://github.com/nicosalgadogit/LlanquihueTourApp ] 
**Fecha de entrega:** \[fecha de entrega semana 6]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I