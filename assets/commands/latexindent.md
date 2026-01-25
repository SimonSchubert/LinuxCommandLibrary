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

**Check only (no modification)**

```latexindent -c [document.tex]```

# SYNOPSIS

**latexindent** [_options_] _file_

# PARAMETERS

**-w**, **--overwrite**
> Overwrite original file.

**-o** _file_
> Output to specific file.

**-l** [_file_]
> Use local settings file.

**-s**, **--silent**
> Silent mode.

**-c** _dir_
> Check mode, use directory for cruft.

**-m**, **--modifylinebreaks**
> Modify line breaks.

**-g** _file_
> Log file location.

**--replacement**
> Enable replacement mode.

**-y** _yaml_
> Settings in YAML format.

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
