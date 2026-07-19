# TAGLINE

command-line HTML5 validation tool using the Nu Html Checker

# TLDR

**Validate an HTML file**

```html5validator [file.html]```

**Validate all HTML in directory**

```html5validator --root [path/to/directory]```

**Show warnings**

```html5validator --show-warnings [file.html]```

**Match custom file pattern**

```html5validator --root [path] --match "*.html *.php"```

**Exclude directories**

```html5validator --root [path] --blacklist "node_modules vendor"```

**Output as JSON**

```html5validator --format json [file.html]```

**Ignore specific errors**

```html5validator --ignore-re 'Attribute "ng-[a-z-]+" not allowed' [file.html]```

# SYNOPSIS

**html5validator** [_options_] [_files_]

# PARAMETERS

**--root** _dir_
> Start directory for file search.

**--match** _pattern_
> File patterns to match (default *.html).

**--blacklist** _dirs_
> Directory names to skip.

**--show-warnings**
> Show warnings as errors.

**--format** _fmt_
> Output format: gnu, xml, json, text.

**--ignore-re** _regex_
> Ignore errors matching regex.

**--ignore** _message_
> Ignore errors that exactly match the given message.

**--also-check-css**
> Also validate CSS files (matches *.html and *.css by default).

**--config** _file_
> Read options from a configuration file.

# DESCRIPTION

**html5validator** is a command-line HTML5 validation tool using the Nu Html Checker (v.Nu). Designed for static site generators and continuous integration. Returns exit code 0 for valid HTML. Requires Python 3.6+ and Java 8.

# CAVEATS

Requires a working **Java** runtime (OpenJDK 8+) on the **PATH**, since it shells out to the bundled **vnu.jar** to perform the actual validation.

# SEE ALSO

[tidy](/man/tidy)(1)

# RESOURCES

```[Source code](https://github.com/svenkreiss/html5validator)```

<!-- verified: 2026-07-19 -->

