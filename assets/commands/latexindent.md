# TAGLINE

formats LaTeX source code with consistent indentation

# TLDR

**Format LaTeX file**

```latexindent [document.tex]```

**Format and save in place**

```latexindent -w [document.tex]```

**Format with local settings**

```latexindent -l [document.tex]```

**Specify output file**

```latexindent [input.tex] -o [output.tex]```

**Silence output**

```latexindent -s [document.tex]```

**Send backup and log files to a different directory**

```latexindent -c [path/to/cruft/dir/] [document.tex]```

**Overwrite only if content changed**

```latexindent -wd [document.tex]```

# SYNOPSIS

**latexindent** [_options_] _file_

# PARAMETERS

**-w**, **--overwrite**
> Overwrite original file (backup is created first).

**-wd**, **--overwriteIfDifferent**
> Overwrite original file only if the indented text differs.

**-o** _file_
> Output to specific file.

**-l** [_file_]
> Use local settings YAML file (default: localSettings.yaml).

**-s**, **--silent**
> Silent mode; suppress terminal output.

**-c** _dir_
> Send backup files and indent.log to the specified directory instead of the current directory.

**-m**, **--modifylinebreaks**
> Modify line breaks according to settings.

**-g** _file_
> Specify log file location.

**--replacement**
> Enable replacement mode for string/regex substitutions.

**-y** _yaml_
> Provide YAML settings inline (e.g., -y="defaultIndent: '  '").

# DESCRIPTION

**latexindent** formats LaTeX source code with consistent indentation. It handles environments, commands, and special constructs intelligently.

The tool is configured through YAML files, allowing customization of indent size, environments, and special cases.

# LOCAL SETTINGS

```yaml
# localSettings.yaml
defaultIndent: "  "
removeTrailingWhitespace: 1
noAdditionalIndent:
  document: 1
```

# CAVEATS

Perl-based; requires Perl and YAML::Tiny. May change semantics in edge cases. Backup files created by default. Complex documents may need custom rules.

# HISTORY

latexindent was written by **Chris Hughes** as a Perl script for formatting LaTeX code. It's included in TeX Live and is commonly used for maintaining consistent LaTeX codestyle.

# SEE ALSO

[latex](/man/latex)(1), [latexmk](/man/latexmk)(1), [prettier](/man/prettier)(1)
