# CicloVida/JetpackCompose - App Android

Este proyecto es una aplicación simple de Android que demuestra el ciclo de vida de una actividad en Android utilizando Jetpack Compose. La aplicación realiza un seguimiento del tiempo que la actividad está activa, registrando el tiempo en que se pausó.

Tambien se puede ver una interfaz gráfica con 6 botones y un contador de rondas, un boton cambia el texto que tiene en este caso es `Start` y cambia a `Reset`, otro suma uno a la ronda, mientras que los que tienen colores no hacen nada por ahora.

## Descripción

La aplicación consta de una `MainActivity` que sobrescribe los métodos principales del ciclo de vida de Android: `onCreate`, `onStart`, `onResume`, `onPause`, `onStop` y `onDestroy`. En el método `onStart` obtiene el tiempo de inicio de la aplicacion y en el metodo `onPause`, calcula y muestra el tiempo activo de la aplicación en segundos.

Se añadio una clase para almacenar funciones que sirven para:

- Crear botones basicos añadiendoles solo el color.
- Sumar 1 a la ronda
- Comprobar que la ronda no supere 10 en caso de que lo haga se agrandara el espacio de borde.

### Características
- Registro del ciclo de vida de la actividad.
- Cálculo del tiempo de actividad desde que se inicia hasta que se pausa.
- Cambios en la interfaz a tiempo real.
- Funciones básicas al tocar los botones.

### Preview

![image](https://github.com/user-attachments/assets/7bbd6d89-a837-46a4-958c-bb7d600b270f)
