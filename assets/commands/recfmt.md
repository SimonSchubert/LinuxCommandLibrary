# TAGLINE

Format GNU recutils records with templates

# TLDR

**Format records with inline template**

```recsel [file.rec] | recfmt "{{Name}}: {{Email}}"```

**Format records using a template file**

```recsel [file.rec] | recfmt -f [template.fmt]```

**Select and format specific record type**

```recsel -t [Type] [file.rec] | recfmt "{{Title}} by {{Author}}"```

# SYNOPSIS

**recfmt** [_options_] [_template_]

# PARAMETERS

**-f**, **--file** _FILENAME_
> Load the template from a file instead of a command-line argument.

**--help**
> Print help and exit.

**--version**
> Show version and exit.

# DESCRIPTION

**recfmt** applies a template to records read from standard input. Fields are referenced using double-brace slots like **{{FieldName}}**. For each input record, one copy of the template is generated with field values substituted. Typically used by piping output from **recsel** into **recfmt**.

Part of GNU recutils.

# EXAMPLES

```bash
# Simple format from recsel output
recsel contacts.rec | recfmt "Name: {{Name}}, Email: {{Email}}"

# From template file
recsel data.rec | recfmt -f report.fmt

# Specific record type with selection
recsel -t Book library.rec | recfmt "{{Title}} by {{Author}}"

# Combine with expression filtering
recsel -e "Status = 'active'" items.rec | recfmt "- {{Name}}"
```

# TEMPLATE SYNTAX

```
{{FieldName}}          - Substituted with field value
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

[recsel](/man/recsel)(1), [rec2csv](/man/rec2csv)(1), [recins](/man/recins)(1), [recdel](/man/recdel)(1), [recset](/man/recset)(1)
