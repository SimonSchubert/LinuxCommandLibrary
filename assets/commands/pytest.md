# TAGLINE

Python testing framework with fixtures and plugins

# TLDR

**Run all tests**

```pytest```

**Run specific test file**

```pytest [test_file.py]```

**Run specific test function**

```pytest [test_file.py]::[test_function]```

**Run tests matching keyword**

```pytest -k "[keyword]"```

**Run with verbose output**

```pytest -v```

**Stop on first failure**

```pytest -x```

**Show print statements**

```pytest -s```

**Run tests in parallel**

```pytest -n [4]```

# SYNOPSIS

**pytest** [_-v_] [_-x_] [_-k expression_] [_-m marker_] [_--cov package_] [_options_] [_paths_]

# PARAMETERS

**-v**, **--verbose**
> Increase verbosity.

**-q**, **--quiet**
> Decrease verbosity.

**-x**, **--exitfirst**
> Stop on first failure.

**-s**, **--capture=no**
> Disable output capture (show print).

**-k** _EXPRESSION_
> Run tests matching keyword expression.

**-m** _MARKER_
> Run tests with specific marker.

**--collect-only**
> List tests without running.

**--lf**, **--last-failed**
> Run only last failed tests.

**--ff**, **--failed-first**
> Run failed tests first.

**-n** _NUM_
> Parallel workers (pytest-xdist).

**--cov** _PACKAGE_
> Measure coverage (pytest-cov).

**--cov-report** _TYPE_
> Coverage report format.

**--pdb**
> Drop into debugger on failure.

**--tb** _STYLE_
> Traceback style: short, long, line, native, no.

**--maxfail** _NUM_
> Stop after N failures.

**--ignore** _PATH_
> Ignore path during collection.

**--durations** _NUM_
> Show N slowest tests.

# DESCRIPTION

**pytest** is Python's most popular testing framework. It discovers and runs tests automatically, with powerful fixtures, parameterization, and plugin ecosystem.

Test discovery finds files matching test_*.py or *_test.py, and functions/methods starting with test_. Classes starting with Test are also collected. This convention-based approach minimizes configuration.

Fixtures provide reusable test dependencies. Defined with @pytest.fixture, they can set up databases, create objects, or configure environments. Fixtures can be scoped (function, class, module, session) for efficient resource management.

Parameterization runs tests with multiple inputs using @pytest.mark.parametrize. Markers (@pytest.mark.X) tag tests for selective running or custom behavior.

The plugin ecosystem extends functionality: pytest-cov for coverage, pytest-xdist for parallel execution, pytest-mock for mocking, and hundreds more. Plugins install via pip and activate automatically.

Assertion introspection provides detailed failure messages without special assertion methods. Standard Python assert statements work with rich comparison displays.

# CONFIGURATION

**pytest.ini**
> Primary configuration file for test discovery paths, markers, command-line defaults, and plugin settings.

**pyproject.toml**
> Project configuration with a `[tool.pytest.ini_options]` section supporting the same options as pytest.ini.

**setup.cfg**
> Alternative configuration file with a `[tool:pytest]` section for test settings.

**conftest.py**
> Per-directory fixture and plugin file automatically loaded by pytest, used to define shared fixtures, hooks, and test configuration.

# CAVEATS

Large test suites need pytest-xdist for reasonable runtime. Fixture complexity can obscure test logic. Plugin conflicts occasionally occur. Coverage may miss some code patterns. Parameterized test output can be verbose.

# HISTORY

**pytest** was created by **Holger Krekel** around **2004** as py.test, evolving from the py library. It grew as an alternative to unittest, emphasizing simplicity and minimal boilerplate. The project became pytest around **2016** with the 3.0 release. It's now the de facto standard for Python testing.

# SEE ALSO

[python](/man/python)(1), [coverage](/man/coverage)(1), [tox](/man/tox)(1), [unittest](/man/unittest)(1)
