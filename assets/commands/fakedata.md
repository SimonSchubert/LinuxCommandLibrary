# TLDR

**Generate fake names**

```fakedata name```

**Generate multiple records**

```fakedata -l [10] name email```

**Generate with custom format**

```fakedata --format "{{name}},{{email}}"```

**Generate specific type**

```fakedata email phone address```

**Output as JSON**

```fakedata -f json name email```

**Generate with seed**

```fakedata --seed [42] name```

# SYNOPSIS

**fakedata** [_options_] _generator_...

# PARAMETERS

**-l**, **--limit** _count_
> Number of records.

**-f**, **--format** _format_
> Output format (csv, json, tab).

**--seed** _seed_
> Random seed for reproducibility.

**-c**, **--constraint** _constraint_
> Add constraints.

**--generators**
> List available generators.

# DESCRIPTION

**fakedata** generates fake data for testing and development. Supports many types including names, emails, addresses, dates, numbers, and custom formats.

# SEE ALSO

[faker](/man/faker)(1)

