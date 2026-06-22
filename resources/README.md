![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Semana 5 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Nicolas Salgado
- **Sección:** 2026_202_OL_PRY2202_24613393_PCT
- **Carrera:** Ingeniería en Informática
- **Sede:** Antonio Varas

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la actividad sumativa de la Semana 5 de la asignatura Desarrollo Orientado a Objetos I. Se trata de un sistema orientado a objetos desarrollado en Java, cuyo objetivo es modelar y gestionar los tours de la agencia de turismo Llanquihue Tour, aplicando los principios de encapsulamiento, composición y manejo de excepciones.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── ui/      # Clase principal con el método main
├── model/   # Clases de dominio (Tour, GuiaTuristico, Direccion)
└── data/    # Clase para la carga y lectura del archivo .txt
```
## 🧩 Paquetes y clases implementadas

| Clase | Paquete | Descripción |
|---|---|---|
| `Tour` | `model` | Representa un tour con nombre, tipo, reservas, guía y dirección |
| `GuiaTuristico` | `model` | Representa el guía asignado a un tour |
| `Direccion` | `model` | Representa la dirección donde se realiza el tour |
| `GestorDatos` | `data` | Lee el archivo `tours.txt` y construye la lista de objetos Tour |
| `Main` | `ui` | Carga los datos, los muestra y aplica filtros por consola |
---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/nicosalgadogit/LlanquihueTourApp.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que el archivo `tours.txt` esté correctamente ubicado en la carpeta `resources/`.

4. Ejecuta el archivo `Main.java` desde el paquete `ui`.

---

**Repositorio GitHub:** \[https://github.com/nicosalgadogit/LlanquihueTourApp]
**Fecha de entrega:** \[22/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I