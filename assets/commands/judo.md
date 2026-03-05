# TAGLINE

CLI integration testing framework driven by YAML

# TLDR

**Run tests from a YAML file**

```judo [path/to/test.yml]```

**Run a test suite directory**

```judo [path/to/tests/]```

**Run with a timeout**

```judo [path/to/test.yml] --timeout [5000]```

**Generate JUnit report**

```judo [path/to/test.yml] --junitreport```

# SYNOPSIS

**judo** [**--timeout** _ms_] [**--junitreport**] _file_|_directory_

# DESCRIPTION

**judo** is a CLI integration testing framework that tests command-line tools using simple YAML or JSON files. It executes commands, responds to stdin when expected stdout output occurs, asserts exit codes, and verifies that stdout and stderr contain or don't contain certain strings.

The framework is designed for automated testing of CLI applications using nothing but stdin, stdout, and stderr, making it ideal for CI/CD pipelines.

# CAVEATS

Requires **Node.js** and npm for installation. Test scenarios must be defined in YAML or JSON format. Interactive programs with complex terminal handling may not be fully testable.

# HISTORY

**judo** was created by **Intuit** and is written in **JavaScript/Node.js**. It was designed to simplify integration testing of command-line tools in automated environments.

# SEE ALSO

[bats](/man/bats)(1), [expect](/man/expect)(1)
