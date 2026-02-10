# TAGLINE

runs the "test" script defined in package

# TLDR

**Run tests**

```npm test```

**Run tests with arguments**

```npm test -- --coverage```

**Run tests silently**

```npm test --silent```

**Shorthand**

```npm t```

# SYNOPSIS

**npm test** [-- _args_]

# PARAMETERS

**--**
> Pass arguments to test script.

**--silent**
> Reduce output.

**--ignore-scripts**
> Don't run scripts.

# DESCRIPTION

**npm test** runs the "test" script defined in package.json. It's an alias for "npm run test" and is the conventional command for running a project's test suite.

Exit code 0 indicates success; non-zero indicates test failure.

# PACKAGE.JSON

```json
{
  "scripts": {
    "test": "jest",
    "test:watch": "jest --watch",
    "test:coverage": "jest --coverage"
  }
}
```

# COMMON TEST SCRIPTS

```bash
# Jest
"test": "jest"

# Mocha
"test": "mocha"

# Vitest
"test": "vitest"

# TAP
"test": "tap test/*.js"
```

# CAVEATS

Requires test script to be defined. Default exits with error if no script. Use npm run test:name for custom test scripts.

# HISTORY

npm test became the standard test command for Node.js projects, integrated into CI/CD pipelines universally.

# SEE ALSO

[npm](/man/npm)(1), [npm-run-script](/man/npm-run-script)(1), [npm-start](/man/npm-start)(1)
