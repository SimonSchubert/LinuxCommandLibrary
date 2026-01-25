# TLDR

**Update field value**

```recset -f [Field] -v "[new_value]" -e "[condition]" [file.rec]```

**Set field in all records**

```recset -f [Status] -v "[active]" [file.rec]```

**Update specific type**

```recset -t [Type] -f [Field] -v "[value]" -e "[condition]" [file.rec]```

**Add field if missing**

```recset -a -f [NewField] -v "[value]" [file.rec]```

# SYNOPSIS

**recset** [_options_] [_file_]

# PARAMETERS

**-t**, **--type** _type_
> Record type.

**-f**, **--field** _name_
> Field to set.

**-v**, **--value** _value_
> New value.

**-e**, **--expression** _expr_
> Selection expression.

**-a**, **--add**
> Add field if missing.

**-n**, **--num** _n_
> Update first n matches.

# DESCRIPTION

**recset** modifies field values in GNU recutils files. It can update existing fields or add new ones based on selection criteria.

Part of GNU recutils.

# EXAMPLES

```bash
# Update matching records
recset -f Status -v "completed" -e "Status = 'pending'" tasks.rec

# Update all records
recset -f Updated -v "$(date)" data.rec

# Update specific type
recset -t Contact -f Phone -v "555-0000" -e "Name = 'John'" contacts.rec

# Add field if not exists
recset -a -f Category -v "General" -e "!Category" items.rec

# Update first match
recset -n 1 -f Priority -v "high" -e "Status = 'new'" tasks.rec
```

# CAVEATS

Modifies file in place. Use selection expressions carefully. Part of GNU recutils.

# HISTORY

recset is part of **GNU recutils** by **Jose E. Marchesi** for managing text databases.

# SEE ALSO

[recsel](/man/recsel)(1), [recins](/man/recins)(1), [recdel](/man/recdel)(1), [recutils](/man/recutils)(7)
