**Instrucciones y Pasos para la Práctica 11: Ejecutar y Automatizar un Flujo de Trabajo con GitHub Actions**

---

### A. Ejecutar un Flujo de Trabajo Manualmente en GitHub Actions

#### Paso 1: Configurar el Repositorio Localmente

1. **Clona el Repositorio:** `git clone https://github.com/tu-usuario/tu-proyecto.git`

#### Paso 2: Crear un Archivo YAML de Configuración para GitHub Actions

1. **Crea un Directorio:** `mkdir .github/workflows`
2. **Crea un Archivo YAML:** `touch .github/workflows/ci.yml`

#### Paso 3: Configurar el Flujo de Trabajo en YAML

**Archivo `.github/workflows/ci.yml`**

```yaml
name: Pruebas Automatizadas

on: [push]

jobs:
  pruebas:
    runs-on: ubuntu-latest
    
    steps:
    - name: Checkout código fuente
      uses: actions/checkout@v2
      
    - name: Configurar Node.js
      uses: actions/setup-node@v2
      with:
        node-version: 14
    
    - name: Instalar dependencias y ejecutar pruebas
      run: |
        npm install
        npm test
      working-directory: ./mi-app # Asegúrate de que la ruta sea correcta
```

#### Paso 4: Crear un Cambio y Hacer un Push

1. **Realiza un Cambio:** Modifica un archivo de prueba o código.
2. **Haz un Commit:** `git add . && git commit -m "Agregando cambios"`
3. **Haz un Push:** `git push origin main`

#### Paso 5: Verificar el Flujo de Trabajo en GitHub Actions

1. **En GitHub:** Ve a la pestaña "Actions" en tu repositorio.
2. **Verifica el Flujo de Trabajo:** Deberías ver el flujo de trabajo `Pruebas Automatizadas` en ejecución.

---

### Automatizar el Flujo de Trabajo con GitHub Actions

#### Paso 6: Crear un Token de Acceso Personal en GitHub

1. **En GitHub:** Ve a "Settings" -> "Developer settings" -> "Personal access tokens".
2. **Genera un Token:** Configura los permisos y guárdalo en un lugar seguro.

#### Paso 7: Configurar Variables de Entorno en GitHub

1. **En GitHub:** Ve a "Settings" -> "Secrets".
2. **Crea una Secreta:** Crear una nueva secreta llamada `GH_TOKEN` con el valor de tu token de acceso personal.

#### Paso 8: Actualizar el Archivo YAML para Automatizar el Flujo de Trabajo

**Archivo `.github/workflows/ci.yml`**

```yaml
name: Pruebas Automatizadas

on: [push]

jobs:
  pruebas:
    runs-on: ubuntu-latest
    
    steps:
    - name: Checkout código fuente
      uses: actions/checkout@v2
      
    - name: Configurar Node.js
      uses: actions/setup-node@v2
      with:
        node-version: 14
    
    - name: Instalar dependencias y ejecutar pruebas
      run: |
        npm install
        npm test
      working-directory: ./mi-app # Asegúrate de que la ruta sea correcta
    
    - name: Subir resultados de las pruebas
      uses: actions/upload-artifact@v2
      with:
        name: test-results
        path: ./ruta/a/tu/carpeta/de/resultados # Asegúrate de que la ruta sea correcta
    
    - name: Desplegar en servidor de producción
      if: success()
      run: |
        ssh usuario@servidor "cd /ruta/a/mi-app && git pull origin main && npm install && npm run build"
      env:
        MI_APP_PROD_SERVER: produccion
      working-directory: ./mi-app # Asegúrate de que la ruta sea correcta
      env:
        GH_TOKEN: ${{ secrets.GH_TOKEN }}
```

#### Paso 9: Realizar un Commit y Push

1. **Realiza un Commit:** `git add . && git commit -m "Automatizar pruebas y despliegue"`
2. **Haz un Push:** `git push origin main`

#### Paso 10: Verificar el Flujo de Trabajo Automatizado

1. **En GitHub:** Ve a la pestaña "Actions" en tu repositorio.
2. **Verifica el Flujo de Trabajo Automatizado:** Deberías ver el flujo de trabajo `Pruebas Automatizadas` ejecutándose automáticamente en cada push.

---

