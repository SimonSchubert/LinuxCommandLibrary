# TAGLINE

Static security analyzer for PHP code

# TLDR

**Scan a directory**

```progpilot [src/]```

**Scan specific files and directories**

```progpilot [file.php] [folder/]```

**Use a configuration file**

```progpilot --configuration [configuration.yml] [src/]```

**Save the JSON report to a file**

```progpilot [src/] > [report.json]```

# SYNOPSIS

**progpilot** [**--configuration** _file_] _files_...

# PARAMETERS

_files_
> PHP files and directories to analyze.

**--configuration** _FILE_
> YAML configuration file. Without it, the default configuration is used.

**--help**
> Show help.

# VULNERABILITIES DETECTED

**SQL Injection** - Database query manipulation
**XSS** - Cross-site scripting
**Code Injection** - Arbitrary code execution
**Path Traversal** - File access outside root
**Command Injection** - Shell command execution

# DESCRIPTION

**progpilot** performs static security analysis on PHP code by tracing the flow of user-controlled data through the application. It uses taint analysis to identify points where unsanitized input reaches dangerous functions such as database queries, shell commands, or HTML output.

The analysis models sources (where user input enters), sinks (where dangerous operations occur), sanitizers and validators. All of these are configurable, allowing teams to define application-specific sensitive functions and custom rules. Upstream strongly recommends customizing them for the application being analyzed.

Results are printed to standard output as JSON, or as SARIF when **sarif_output** is enabled in the configuration. The command exits with status 1 when vulnerabilities are found, which suits CI pipelines.

# CONFIGURATION

**configuration.yml** (any path, passed with **--configuration**)
> YAML file defining sources, sinks, sanitizers, validators, custom rules, **inclusions**, **exclusions**, false positives and output options.

# CAVEATS

Static analysis has false positives. Complex code paths may be missed. There are no command-line flags for include or exclude paths or for output files: use the configuration file and shell redirection.

# SEE ALSO

[phpstan](/man/phpstan)(1), [psalm](/man/psalm)(1), [php](/man/php)(1)

# RESOURCES

```[Source code](https://github.com/designsecurity/progpilot)```

<!-- verified: 2026-11-09 -->
