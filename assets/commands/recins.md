# TAGLINE

Insert records into GNU recutils databases

# TLDR

**Insert record**

```recins -f [Name] -v "[John]" -f [Email] -v "[john@example.com]" [file.rec]```

**Insert with type**

```recins -t [Contact] -f [Name] -v "[Jane]" [file.rec]```

**Insert from template**

```echo "Name: John" | recins [file.rec]```

**Replace if exists**

```recins -r -f [Name] -v "[John]" [file.rec]```

# SYNOPSIS

**recins** [_options_] [_file_]

# PARAMETERS

**-t**, **--type** _type_
> Record type.

**-f**, **--field** _name_
> Field name.

**-v**, **--value** _value_
> Field value.

**-r**, **--replace**
> Replace existing.

**-n**, **--name** _name_
> Set record descriptor.

**-S**, **--sort** _field_
> Sort after insert.

# DESCRIPTION

**recins** adds new records to GNU recutils plain-text database files. Fields and values can be specified on the command line with repeated **-f** and **-v** flags, or records can be piped in from stdin in standard recfile format (key-value pairs separated by blank lines).

The **-t** flag assigns a record type, **-r** replaces an existing record instead of appending, and **-S** sorts records after insertion. The file is created automatically if it does not exist. Part of the GNU recutils toolkit.

# EXAMPLES

```bash
# Insert single record
recins -f Name -v "Alice" -f Email -v "alice@example.com" contacts.rec

# With record type
recins -t Book -f Title -v "1984" -f Author -v "Orwell" library.rec

# Multiple fields
recins -t Product \
  -f Name -v "Widget" \
  -f Price -v "9.99" \
  -f Stock -v "100" \
  inventory.rec

# From stdin
cat << EOF | recins contacts.rec
Name: Bob
Email: bob@example.com
Phone: 555-1234
EOF
```

# CAVEATS

Creates file if doesn't exist. Appends by default. Part of GNU recutils.

# HISTORY

recins is part of **GNU recutils** by **Jose E. Marchesi** for text-based database management.

# SEE ALSO

[recsel](/man/recsel)(1), [recdel](/man/recdel)(1), [recset](/man/recset)(1), [recutils](/man/recutils)(7)
