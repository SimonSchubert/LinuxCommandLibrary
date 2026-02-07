# TAGLINE

Python code coverage measurement tool

# TLDR

**Run a Python script with coverage**

```coverage run [script.py]```

**Run pytest with coverage**

```coverage run -m pytest```

**Show coverage report in terminal**

```coverage report```

**Generate HTML coverage report**

```coverage html```

**Show only files with less than 80% coverage**

```coverage report --fail-under=80```

**Combine coverage from multiple runs**

```coverage combine```

**Erase collected coverage data**

```coverage erase```

**Show coverage for specific file**

```coverage report --include=[path/to/file.py]```

# SYNOPSIS

**coverage** _command_ [_options_] [_args_]

# PARAMETERS

**run** [_options_] _program_
> Run a program and collect coverage data.

**report**
> Display coverage report in terminal.

**html**
> Generate HTML report in htmlcov/.

**xml**
> Generate Cobertura XML report.

**json**
> Generate JSON report.

**combine**
> Combine data from multiple coverage files.

**erase**
> Delete collected coverage data.

**-m** _module_
> Run library module as script (like python -m).

**--source** _paths_
> Limit coverage to specified packages/directories.

**--include** _patterns_
> Include only files matching patterns.

**--omit** _patterns_
> Omit files matching patterns.

**--branch**
> Enable branch coverage measurement.

**--fail-under** _n_
> Exit with failure if coverage is below n%.

# DESCRIPTION

**Coverage.py** measures code coverage for Python programs, showing which lines and branches are executed during testing. It helps identify untested code paths and ensures comprehensive test suites.

The tool instruments Python bytecode to track execution. After running tests with **coverage run**, reports show percentage of lines covered per file. HTML reports provide visual highlighting of covered and uncovered lines.

Branch coverage (**--branch**) additionally tracks which conditional branches are taken, catching cases where both sides of an if statement aren't tested.

# CONFIGURATION

**pyproject.toml**
> Configuration in [tool.coverage.run] and [tool.coverage.report] sections for source paths, branch coverage, and reporting thresholds.

**setup.cfg**
> Alternative configuration location using [coverage:run] and [coverage:report] sections.

**.coveragerc**
> Dedicated configuration file for coverage settings, omit patterns, and report options.

# CAVEATS

Coverage measurement adds runtime overhead. Dynamic code generation and exec() may not be tracked correctly. 100% line coverage doesn't guarantee bug-free code. Branch coverage is more thorough but harder to achieve. Multiprocessing requires special configuration.

# HISTORY

Coverage.py was created by **Ned Batchelder** and first released in **2004**. It has become the standard code coverage tool for Python, integrated with test runners like pytest and unittest. The tool is widely used in CI/CD pipelines and is supported by coverage reporting services like Codecov and Coveralls.

# SEE ALSO

[pytest](/man/pytest)(1), [pytest-cov](/man/pytest-cov)(1), [codecov](/man/codecov)(1)
