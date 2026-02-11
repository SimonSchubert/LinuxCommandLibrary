# TAGLINE

Static security analyzer for PHP code

# TLDR

**Scan PHP files**

```progpilot [src/]```

**Scan specific file**

```progpilot [file.php]```

**Use configuration**

```progpilot --configuration [config.yml] [src/]```

**JSON output**

```progpilot --json [src/]```

**Output to file**

```progpilot --output [report.json] [src/]```

**Verbose mode**

```progpilot -v [src/]```

# SYNOPSIS

**progpilot** [_--configuration file_] [_--json_] [_--output file_] [_options_] _files_

# PARAMETERS

**--configuration** _FILE_
> YAML config file.

**--json**
> JSON output format.

**--output** _FILE_
> Output file.

**-v**, **--verbose**
> Verbose output.

**--include** _PATH_
> Include path.

**--exclude** _PATH_
> Exclude path.

**--help**
> Show help.

# VULNERABILITIES DETECTED

**SQL Injection** - Database query manipulation
**XSS** - Cross-site scripting
**Code Injection** - Arbitrary code execution
**Path Traversal** - File access outside root
**Command Injection** - Shell command execution

# DESCRIPTION

**progpilot** performs static security analysis on PHP code by tracing the flow of user-controlled data through the application. It uses taint analysis to identify points where unsanitized input reaches dangerous functions such as database queries, shell commands, or HTML output, flagging potential SQL injection, XSS, command injection, and path traversal vulnerabilities.

The analysis works by modeling sources (where user input enters), sinks (where dangerous operations occur), and sanitizers (functions that neutralize tainted data). All three are configurable through a YAML configuration file, allowing teams to define custom security rules, add application-specific sensitive functions, and suppress false positives.

Output includes the vulnerability type, file location, and affected code path. JSON output mode enables integration with CI/CD pipelines for automated security checks during development.

# CONFIGURATION

**progpilot.yml** (or custom path via **--configuration**)
> YAML configuration file defining sources, sinks, sanitizers, include/exclude paths, and custom vulnerability rules for the analysis.

# CAVEATS

Static analysis has false positives. Complex code paths may be missed. PHP version coverage varies.

# HISTORY

**progpilot** was created for PHP security auditing. It uses static taint analysis to identify security vulnerabilities in web applications.

# SEE ALSO

[phpstan](/man/phpstan)(1), [psalm](/man/psalm)(1), [php](/man/php)(1)
