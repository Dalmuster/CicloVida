# CicloVida - App Android

Este proyecto es una aplicación simple de Android que demuestra el ciclo de vida de una actividad en Android utilizando Jetpack Compose. La aplicación realiza un seguimiento del tiempo que la actividad está activa, registrando el tiempo en que se pausó.

## Descripción

La aplicación consta de una `MainActivity` que sobrescribe los métodos principales del ciclo de vida de Android: `onCreate`, `onStart`, `onResume`, `onPause`, `onStop` y `onDestroy`. En el método `onStart` obtiene el tiempo de inicio de la aplicacion y en el metodo `onPause`, calcula y muestra el tiempo activo de la aplicación en segundos.

### Características
- Registro del ciclo de vida de la actividad.
- Cálculo del tiempo de actividad desde que se inicia hasta que se pausa.

