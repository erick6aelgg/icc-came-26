# Repositorio git del curso ICC de CAME 2026

En este repositorio encontrarás material de código que comparten tus asesores del curso de ICC de CAME. Cualquier duda con el repo, pueden escrbirnos. Un saludo :)

## Guía rápida para revisar el contenido actual en tu dispositivo

Tus asesores se asegurarán de tener todo actualizado en la rama `main` aunque podrás encontrar las distintas versiones en otras ramas, por lo que basta con clonar este repositorio para estar al corriente.

### Primera vez que clonarás el repo

Basta con ingresar el siguiente comando en la terminal de _git bash_ (se asume que usas Windows, por lo que en la [instalación](https://git-scm.com/install/windows) te habrá permitido usarlo)

```Bash
git clone https://github.com/erick6aelgg/icc-came-26.git
```

Si el repo se encuentra privado, seguramente te pedirá tu cuenta y contraseña.

### Ya tenias el repo clonado
Los cambios no se hacen en automático, por lo que deberás realizarlos manualmente, tranquilx, es bastante fácil siguiendo los siguientes pasos:

1. Necesitamos que nuestro repositorio local sepa que hay nuevas cosas en el repo remoto, para ello usaremos el siguiente comando:

```Bash
git fetch
```

2. Ahora que nuestro repo sea consciente de los cambios, hay que aplicarlos, basta con usar el comando a continuación:
```Bash
git pull origin main
```

### Comandos básicos de terminal y git
En el repositorio encontraras en el directorio `comandos` un par de archivos con extensión `.md` (markdown) los cuales contendrán una lista de comandos básicos para que pruebes en tu terminal, leela con atención ya que no queremos eliminar System32 en el proceso, ¿verdad?
(Si usas Visual Studio Code, puedes visualizar los archivos `.md` de mejor manera con el comando `ctrl+shift+v`).