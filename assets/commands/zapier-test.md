# TLDR

**Run tests**

```zapier test```

**Run specific test**

```zapier test --grep "[pattern]"```

**Run with timeout**

```zapier test --timeout [5000]```

# SYNOPSIS

**zapier** **test** [_options_]

# PARAMETERS

**--grep** _pattern_
> Run matching tests.

**--timeout** _ms_
> Test timeout in milliseconds.

# DESCRIPTION

**zapier test** runs integration tests. Executes tests defined in test directory. Validates triggers, actions, and authentication before deployment.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-validate](/man/zapier-validate)(1)

