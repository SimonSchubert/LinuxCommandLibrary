# TAGLINE

Run Zapier integration tests

# TLDR

**Run all tests**

```zapier test```

**Run tests matching a pattern**

```zapier test --grep "[pattern]"```

**Run with a custom timeout**

```zapier test --timeout [5000]```

**Run with environment variables**

```CLIENT_ID=[1234] CLIENT_SECRET=[abcd] zapier test```

# SYNOPSIS

**zapier** **test** [_options_]

# PARAMETERS

**--grep** _pattern_
> Run only tests matching the given pattern.

**--timeout** _ms_
> Test timeout in milliseconds.

# DESCRIPTION

**zapier test** runs the integration tests defined in the test directory using the Mocha test runner. It sets up the Zapier test environment with extra variables compared to running `npm test` directly. Use it to validate triggers, actions, and authentication before deploying your integration.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-validate](/man/zapier-validate)(1)

