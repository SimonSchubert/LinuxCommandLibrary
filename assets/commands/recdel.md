# TLDR

**Delete matching records**

```recdel -e "[Name = 'John']" [file.rec]```

**Delete by record type**

```recdel -t [Type] -e "[condition]" [file.rec]```

**Delete with confirmation**

```recdel -c -e "[Status = 'obsolete']" [file.rec]```

**Delete first N matches**

```recdel -n [1] -e "[condition]" [file.rec]```

# SYNOPSIS

**recdel** [_options_] [_file_]

# PARAMETERS

**-t**, **--type** _type_
> Record type.

**-e**, **--expression** _expr_
> Selection expression.

**-n**, **--num** _n_
> Delete first n records.

**-c**, **--confirm**
> Ask for confirmation.

**-i**, **--case-insensitive**
> Case insensitive matching.

# DESCRIPTION

**recdel** deletes records from GNU recutils files matching a selection expression. It modifies the file in place unless outputting to stdout.

Part of GNU recutils.

# EXAMPLES

```bash
# Delete by condition
recdel -e "Status = 'deleted'" items.rec

# Delete specific type
recdel -t Contact -e "Email ~ 'spam'" contacts.rec

# Delete with confirmation
recdel -c -e "Price < 0" products.rec

# Delete first match only
recdel -n 1 -e "Name = 'Test'" data.rec

# Dry run (output to stdout)
recdel -e "old = 'yes'" file.rec | less
```

# EXPRESSIONS

```
=       - Equal
!=      - Not equal
~       - Regex match
<, >    - Comparison
&&, ||  - Logical operators
```

# CAVEATS

Modifies file in place. Make backups before bulk deletes. Part of GNU recutils.

# HISTORY

recdel is part of **GNU recutils** by **Jose E. Marchesi** for text-based database management.

# SEE ALSO

[recsel](/man/recsel)(1), [recins](/man/recins)(1), [recset](/man/recset)(1), [rec2csv](/man/rec2csv)(1)
