# TAGLINE

CSS code quality checker

# TLDR

**Lint a CSS file**

```csslint [file.css]```

**Lint with specific rules**

```csslint --errors=[rule1,rule2] [file.css]```

**Lint with warnings**

```csslint --warnings=[rule1,rule2] [file.css]```

**Output in specific format**

```csslint --format=[compact|json|text] [file.css]```

**Ignore specific rules**

```csslint --ignore=[rule1,rule2] [file.css]```

# SYNOPSIS

**csslint** [_options_] _file.css_ [_files..._]

# PARAMETERS

**--errors** _rules_
> Comma-separated list of rules to treat as errors.

**--warnings** _rules_
> Comma-separated list of rules to treat as warnings.

**--ignore** _rules_
> Comma-separated list of rules to ignore.

**--format** _format_
> Output format: text, compact, json, checkstyle-xml, lint-xml, junit-xml.

**--list-rules**
> Show all available rules.

# DESCRIPTION

**csslint** is a tool for checking CSS code quality. It identifies potential problems like inefficient selectors, browser compatibility issues, and stylistic errors. The tool checks for patterns that may cause cross-browser issues, performance problems, or maintenance difficulties.

Rules are categorized by severity and cover topics like selector performance, box model compatibility, known browser bugs, and best practices. csslint can be integrated into build processes and continuous integration workflows.

# CONFIGURATION

**.csslintrc**
> JSON configuration file for customizing rules and severity levels.

# SEE ALSO

[stylelint](/man/stylelint)(1), [sass](/man/sass)(1)
