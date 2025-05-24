# Sistema de Flashcards

## Requisitos Previos

Para colaborar en este proyecto, necesitas tener instalado:

1. **Java Development Kit (JDK)**
   - Versión: JDK 17 o superior
   - Puedes descargarlo de: https://adoptium.net/

2. **Maven**
   - Versión: 3.6.0 o superior
   - Puedes descargarlo de: https://maven.apache.org/download.cgi

3. **Git**
   - Versión: 2.0.0 o superior
   - Puedes descargarlo de: https://git-scm.com/downloads

4. **IDE Recomendado**
   - IntelliJ IDEA (recomendado)
   - Eclipse
   - VS Code con extensiones de Java

## Pasos para Configurar el Proyecto

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/IgnacioNGarcia/sistema_de_flashcards.git
   cd sistema_de_flashcards
   ```

2. **Cambiar a tu rama de trabajo**
   ```bash
   git checkout tu-rama
   ```

3. **Compilar el proyecto**
   ```bash
   ./mvnw clean install
   ```

4. **Ejecutar el proyecto**
   ```bash
   ./mvnw spring-boot:run
   ```

## Flujo de Trabajo

1. **Antes de empezar a trabajar**
   ```bash
   git checkout main
   git pull origin main
   git checkout tu-rama
   git merge main
   ```

2. **Mientras trabajas**
   ```bash
   git add .
   git commit -m "descripción de los cambios"
   git push origin tu-rama
   ```

3. **Para crear un Pull Request**
   - Ve a GitHub
   - Haz clic en "Pull requests"
   - Haz clic en "New pull request"
   - Selecciona:
     - base: main
     - compare: tu-rama
   - Describe los cambios
   - Crea el PR

## Estructura del Proyecto

```
src/main/java/com/flashcards/
├── exceptions/        # Excepciones personalizadas
├── model/            # Clases del modelo
├── repository/       # Repositorios de datos
├── service/          # Lógica de negocio
├── strategy/         # Patrones de estrategia
└── tester/           # Nombre dudoso, es la interfaz de testear las cards, por cli, api o lo que pinte
```

## Convenciones de Código

1. **Nombres de Clases**: PascalCase
   - Ejemplo: `Flashcard.java`, `Deck.java`

2. **Nombres de Métodos**: camelCase
   - Ejemplo: `getFlashcard()`, `createDeck()`

3. **Nombres de Variables**: camelCase
   - Ejemplo: `flashcardId`, `deckName`

4. **Comentarios**: Usar Javadoc para documentar clases y métodos públicos

## Recursos Adicionales

- [Documentación de Spring Boot](https://spring.io/projects/spring-boot)
- [Guía de Git](https://git-scm.com/doc)
- [Guía de Maven](https://maven.apache.org/guides/) 
