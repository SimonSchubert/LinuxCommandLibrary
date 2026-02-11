# TAGLINE

Query and filter GNU recutils database records

# TLDR

**Select all records** from a recfile

```recsel [file.rec]```

**Select records matching a condition**

```recsel -e "[field] = '[value]'" [file.rec]```

**Select records with multiple conditions**

```recsel -e "[field1] = '[value]' && [field2] > [number]" [file.rec]```

**Select specific fields only**

```recsel -p [field1],[field2] [file.rec]```

**Select records from a specific type**

```recsel -t [record_type] [file.rec]```

**Count matching records**

```recsel -c -e "[condition]" [file.rec]```

**Sort records by a field**

```recsel -S [field] [file.rec]```

# SYNOPSIS

**recsel** [_options_] [**-e** _expression_] [**-t** _type_] [_file_...]

# PARAMETERS

**-e** _expression_
> Select records matching the expression

**-t** _type_
> Select records of specified type only

**-p** _fields_
> Print only specified fields (comma-separated)

**-P** _fields_
> Print specified fields without record separators

**-c**, **--count**
> Print count of matching records

**-C**, **--collapse**
> Collapse multiple field values into one

**-S** _field_
> Sort records by specified field

**-G** _field_
> Group records by specified field

**-n** _max_
> Return at most max records

**-R** _random_
> Return random records

**-d**, **--print-descriptors**
> Print record descriptors

# DESCRIPTION

**recsel** is part of GNU Recutils, a set of tools for managing plain-text databases using the rec format. It selects and prints records from recfiles based on expressions and criteria.

Recfiles are human-readable text files where each record is a collection of named fields separated by blank lines. The format is simple, versionable with git, and editable with any text editor.

Selection expressions support comparison operators (=, !=, <, >, <=, >=), logical operators (&&, ||, !), pattern matching (~), and field existence checks. Expressions operate on field values within each record.

Output can be restricted to specific fields with **-p**, sorted with **-S**, and limited with **-n**. The tool handles multiple record types within a single file using **-t**.

# EXPRESSION SYNTAX

**field = "value"**: Exact string match
**field ~ "pattern"**: Regular expression match
**field < number**: Numeric comparison
**field && field2**: Logical AND
**#field**: Field exists
**!#field**: Field does not exist

# CAVEATS

Field names and string values in expressions must follow recutils quoting rules. Strings with spaces require quotes.

Numeric comparisons require fields to contain valid numbers. Non-numeric values cause comparison failures.

Large recfiles may be slow to process compared to proper databases, but the simplicity and portability often outweigh performance concerns for moderate data sizes.

# SEE ALSO

[recins](/man/recins)(1), [recdel](/man/recdel)(1), [recset](/man/recset)(1), [recfmt](/man/recfmt)(1), [rec2csv](/man/rec2csv)(1)
