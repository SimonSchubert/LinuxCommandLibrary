# TAGLINE

Run unit tests for PlatformIO projects

# TLDR

**Run unit tests**

```pio test```

**Run tests for specific environment**

```pio test -e [native]```

**Run specific test**

```pio test -f [test_example]```

**Run tests with verbose output**

```pio test -v```

# SYNOPSIS

**pio test** [_options_]

# PARAMETERS

**-e**, **--environment** _name_
> Test environment.

**-f**, **--filter** _pattern_
> Test filter pattern.

**-i**, **--ignore** _pattern_
> Ignore tests matching pattern.

**--upload-port** _port_
> Upload port for device tests.

**-v**, **--verbose**
> Verbose output.

**--without-building**
> Skip building before testing.

# DESCRIPTION

**pio test** runs unit tests for PlatformIO projects. Supports both native (desktop) and embedded testing. Uses Unity test framework by default. Tests can run on actual hardware or simulators.

# SEE ALSO

[pio-run](/man/pio-run)(1), [pio-debug](/man/pio-debug)(1)

