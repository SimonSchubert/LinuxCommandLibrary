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

**--test-port** _port_
> Serial/UART port used as communication interface for tests.

**-d**, **--project-dir** _path_
> Specify project directory path.

**-c**, **--project-conf** _file_
> Use a custom platformio.ini file.

**-v**, **--verbose**
> Verbose output (repeat for more: -vv, -vvv).

**--without-building**
> Skip the build stage.

**--without-uploading**
> Skip the upload stage.

**--without-testing**
> Skip the test stage.

**--list-tests**
> List tests without running them.

**--json-output**
> Return output in JSON format.

**--junit-output-path** _file_
> Generate a JUnit XML report at the given path.

# DESCRIPTION

**pio test** runs unit tests for PlatformIO projects. Supports both native (desktop) and embedded testing. Uses Unity test framework by default. Tests can run on actual hardware or simulators.

# SEE ALSO

[pio-run](/man/pio-run)(1), [pio-debug](/man/pio-debug)(1)

