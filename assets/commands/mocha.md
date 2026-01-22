# TLDR

**Run tests**

```mocha```

**Run specific file**

```mocha [test/spec.js]```

**Watch mode**

```mocha --watch```

**Run with grep**

```mocha --grep "[pattern]"```

**Reporter style**

```mocha --reporter [spec]```

**Recursive tests**

```mocha --recursive```

# SYNOPSIS

**mocha** [_options_] [_files_]

# PARAMETERS

_FILES_
> Test files to run.

**--watch**
> Watch for changes.

**--grep** _PATTERN_
> Filter tests.

**--reporter** _NAME_
> Output format.

**--recursive**
> Include subdirectories.

**--timeout** _MS_
> Test timeout.

**--help**
> Display help information.

# DESCRIPTION

**mocha** is a JavaScript test framework. It runs in Node.js and browsers.

The tool provides BDD/TDD testing styles. Supports async tests and many reporters.

mocha runs JavaScript tests.

# CAVEATS

Node.js required. Requires assertion library. Configuration via .mocharc.

# HISTORY

Mocha was created by **TJ Holowaychuk** as a feature-rich JavaScript test framework.

# SEE ALSO

[jest](/man/jest)(1), [jasmine](/man/jasmine)(1), [npm](/man/npm)(1)

