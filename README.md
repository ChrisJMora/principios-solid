# Principios-solid

## Integrantes: Juan Araujo, Amy Cherrez, Christian Jacome, Mateo Jaramillo

## Evidencias de Ejecucion

### Ejercicio 1: Principio de Responsabilidad Única (SRP)

![Ejecución del principio SRP](./principios-solid/imagenes/SRP.jpg)

### Ejercicio 2: Principio Abierto/Cerrado (OCP)

![Ejecución del principio OCP](./principios-solid/imagenes/OCP.jpg)

### Ejercicio 3: Principio de Sustitución de Liskov (LSP)

![Ejecución del principio LSP](./principios-solid/imagenes/LSP.jpg)

### Ejercicio 4: Principio de Segregación de Interfaces (ISP)

![Ejecución del principio ISP](./principios-solid/imagenes/ISP.jpg)

### Ejercicio 5: Principio de Inversión de Dependencias (DIP)

![Ejecución del principio DIP](./principios-solid/imagenes/DIP.jpg)


# Reflexion Final

### SRP

En el principio de responsabilidad única se aplico la idea de que una clase debe de tener solamente una razón para poder cambiar, por lo cual, al separar la lógica en clases distintas, se logró un código más organizado y fácil de mantener.

### OCP

El principio de OCP se lo implemento haciendo que las clases estén abiertas para su extensión, pero cerradas a la modificación con lo cual se resolvió el problema de tener que tocar clases ya probadas cada vez que se requería una nueva variante, con lo cual se reduce el riesgo de introducir errores.

### LSP

Este principio se lo aplico asegurando que las subclases pudieran sustituir a sus clases sin tener que alterar el comportamiento esperado, en donde se evitaron implementaciones que violaran la coherencia en donde se resolvió problemas como comportamientos inesperados al usar polimorfismos, garantizando una jerarquía de clases que sea más confiable.

### ISP

El principio de ISP se lo abordo con la idea de que las clases solo tengan que implementar lo que realmente se necesitaba con lo cual se pudo resolver el problema de clases forzadas a depender de métodos que no se utilizan.

### DIP

Este principio se lo aplico invirtiendo la dependencia hacia las abstracciones en lugar de clases concretas en donde se pudo resolver el problema de tener sistemas rígidos complicados de modificar o escalar.
