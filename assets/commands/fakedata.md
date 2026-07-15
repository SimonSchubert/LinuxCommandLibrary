# TAGLINE

test data generator for development

# TLDR

**List available generators**

```fakedata --generators```

**Generate fake names**

```fakedata name```

**Combine generators** (one column each)

```fakedata name email```

**Generate a specific number of rows**

```fakedata -l [10] name email```

**Output as CSV**

```fakedata -f csv name email```

**Output as SQL INSERT statements**

```fakedata -f sql name email```

**Generate from a custom template** (generator names capitalized)

```echo "{{Name}},{{Email}}" | fakedata```

# SYNOPSIS

**fakedata** [_options_] _generator_...

# PARAMETERS

**-l**, **--limit** _count_
> Number of rows to generate (default 10).

**-f**, **--format** _format_
> Output format: csv, tab, or sql.

**--generators**
> List all available generators and exit.

# DESCRIPTION

**fakedata** generates fake data for testing and development. It provides numerous data generators for creating realistic but synthetic information including names, emails, addresses, phone numbers, dates, numbers, and custom format strings.

The tool is designed for populating test databases, creating sample datasets, and development work where realistic data is needed without using actual user information. It supports multiple output formats including CSV, JSON, and tab-separated values.

Generators can be combined in a single invocation, and the seed option enables reproducible data generation for consistent test scenarios.

# SEE ALSO

[faker](/man/faker)(1)

# RESOURCES

```[Source code](https://github.com/lucapette/fakedata)```

<!-- verified: 2026-07-15 -->

