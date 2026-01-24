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

**progpilot** performs static security analysis on PHP code. It detects vulnerabilities through dataflow analysis.

Taint tracking follows user input through code. Dangerous function calls with tainted data are flagged.

Configuration customizes analysis rules. Sensitive functions and sanitizers are definable.

Output includes vulnerability location and type. JSON format enables CI/CD integration.

Sources, sinks, and sanitizers are configurable. Custom security rules extend detection.

# CAVEATS

Static analysis has false positives. Complex code paths may be missed. PHP version coverage varies.

# HISTORY

**progpilot** was created for PHP security auditing. It uses static taint analysis to identify security vulnerabilities in web applications.

# SEE ALSO

[phpstan](/man/phpstan)(1), [psalm](/man/psalm)(1), [php](/man/php)(1)
