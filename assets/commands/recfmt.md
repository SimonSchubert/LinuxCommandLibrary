# TAGLINE

Format GNU recutils records with templates

# TLDR

**Format records with template**

```recfmt -f "[template]" [file.rec]```

**Use template file**

```recfmt -t [template.fmt] [file.rec]```

**Format specific type**

```recfmt -s [Type] -f "[template]" [file.rec]```

# SYNOPSIS

**recfmt** [_options_] [_file_]

# PARAMETERS

**-f**, **--format** _template_
> Format template string.

**-t**, **--template** _file_
> Template file.

**-s**, **--type** _type_
> Record type to format.

# DESCRIPTION

**recfmt** formats GNU recutils records using a template. It allows custom output formatting with field substitution, useful for generating reports or custom views.

Part of GNU recutils.

# EXAMPLES

```bash
# Simple format
recfmt -f "Name: {{Name}}, Email: {{Email}}" contacts.rec

# From template file
recfmt -t report.fmt data.rec

# Specific record type
recfmt -s Book -f "{{Title}} by {{Author}}" library.rec

# Combine with selection
recsel -e "Status = 'active'" items.rec | recfmt -f "- {{Name}}"
```

# TEMPLATE SYNTAX

```
{{FieldName}}          - Field value
{{#FieldName}}...{{/}} - Conditional
{{FieldName|default}}  - Default value
```

# TEMPLATE FILE

```
# report.fmt
=== {{Name}} ===
Email: {{Email}}
Phone: {{Phone}}
---
```

# CAVEATS

Template syntax differs from other templating systems. Part of GNU recutils.

# HISTORY

recfmt is part of **GNU recutils** by **Jose E. Marchesi** for flexible record formatting.

# SEE ALSO

[recsel](/man/recsel)(1), [rec2csv](/man/rec2csv)(1), [recutils](/man/recutils)(7)
