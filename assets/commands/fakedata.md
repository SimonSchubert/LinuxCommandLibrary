# TAGLINE

test data generator for development

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

**fakedata** generates fake data for testing and development. It provides numerous data generators for creating realistic but synthetic information including names, emails, addresses, phone numbers, dates, numbers, and custom format strings.

The tool is designed for populating test databases, creating sample datasets, and development work where realistic data is needed without using actual user information. It supports multiple output formats including CSV, JSON, and tab-separated values.

Generators can be combined in a single invocation, and the seed option enables reproducible data generation for consistent test scenarios.

# SEE ALSO

[faker](/man/faker)(1)

