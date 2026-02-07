# TAGLINE

dependency license and security scanner

# TLDR

**Analyze dependencies**

```fossa analyze```

**Test for license issues**

```fossa test```

**Report on a project**

```fossa report attribution```

**Initialize configuration**

```fossa init```

**List analyzed projects**

```fossa list-targets```

# SYNOPSIS

**fossa** _command_ [_options_]

# SUBCOMMANDS

**analyze**
> Analyze project dependencies.

**test**
> Check for license issues.

**report**
> Generate reports.

**init**
> Initialize configuration.

**list-targets**
> List analysis targets.

# PARAMETERS

**--project** _name_
> Project name.

**--revision** _rev_
> Project revision.

**--config** _file_
> Config file path.

# CONFIGURATION

**.fossa.yml**
> Project configuration for analysis targets, dependencies, and policies.

# DESCRIPTION

**fossa** is a dependency analysis tool that scans projects for license compliance and security vulnerabilities. It supports multiple languages and package managers, automatically detecting dependencies and analyzing their licenses against organizational policies.

The tool integrates into CI/CD pipelines to enforce license policies and block builds with compliance issues. It generates attribution reports for open source compliance and tracks security vulnerabilities in dependencies.

Fossa maintains a database of license metadata and vulnerability information, providing detailed reports on project dependencies. It can detect direct and transitive dependencies across complex build systems.

# CAVEATS

Requires API key and online connection to Fossa service. Analysis accuracy depends on proper build configuration. Some package managers may need manual configuration.

# HISTORY

**Fossa** was founded in **2015** to address license compliance challenges in modern software development. The platform grew to support multiple languages and became a standard tool for open source license management.

# SEE ALSO

[snyk](/man/snyk)(1), [npm-audit](/man/npm-audit)(1)

