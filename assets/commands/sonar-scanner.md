# TAGLINE

SonarQube static code analysis scanner

# TLDR

**Run analysis**

```sonar-scanner```

**With project key**

```sonar-scanner -Dsonar.projectKey=[myproject]```

**Specify server**

```sonar-scanner -Dsonar.host.url=[http://localhost:9000]```

**With token**

```sonar-scanner -Dsonar.login=[token]```

**Set source directory**

```sonar-scanner -Dsonar.sources=[src]```

**Debug mode**

```sonar-scanner -X```

**Specify config file**

```sonar-scanner -Dproject.settings=[sonar-project.properties]```

# SYNOPSIS

**sonar-scanner** [_-D property=value_] [_-X_] [_options_]

# PARAMETERS

**-D** _PROPERTY=VALUE_
> Set property.

**-X**, **--debug**
> Debug output.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version.

# PROPERTIES

**sonar.projectKey** - Project identifier
**sonar.host.url** - Server URL
**sonar.login** - Auth token
**sonar.sources** - Source directories
**sonar.language** - Language
**sonar.exclusions** - Exclude patterns

# DESCRIPTION

**sonar-scanner** performs static analysis for SonarQube/SonarCloud. It scans code for bugs, vulnerabilities, and code smells.

Configuration via properties or file. sonar-project.properties defines project.

Analysis results upload to server. Web interface shows findings.

Multiple languages supported. Java, JavaScript, Python, and many others.

CI integration automates scanning. Run on every build or pull request.

# CONFIGURATION

**sonar-project.properties**
> Project-level configuration file defining project key, source directories, language, and exclusion patterns.

**SONAR_TOKEN**
> Environment variable for authentication token to SonarQube or SonarCloud.

**SONAR_HOST_URL**
> Environment variable specifying the SonarQube server URL.

# CAVEATS

Requires SonarQube/Cloud instance. Token needed for upload. Large projects take time.

# HISTORY

**SonarQube** was created by **SonarSource** for continuous code quality. The scanner is the analysis client that sends data to the server.

# SEE ALSO

[sonarqube](/man/sonarqube)(1), [eslint](/man/eslint)(1), [phpstan](/man/phpstan)(1)
