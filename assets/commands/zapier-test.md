# TAGLINE

Run Zapier integration tests

# TLDR

**Run all tests**

```zapier-platform test```

**Skip validation** before running tests

```zapier-platform test --skip-validate```

**Pass arguments** to the test script

```zapier-platform test -- [--grep pattern]```

Show **debug** output

```zapier-platform test --debug```

Force **yarn** (for example from a sub-directory)

```zapier-platform test --yarn```

**Run with environment variables**

```CLIENT_ID=[1234] CLIENT_SECRET=[abcd] zapier-platform test```

# SYNOPSIS

**zapier-platform** **test** [_options_] [**--** _test-args_]

# PARAMETERS

**--skip-validate**
> Do not run **zapier-platform validate** before the tests.

**--yarn**
> Use yarn instead of npm. Happens automatically if a yarn.lock file exists.

**--pnpm**
> Use pnpm instead of npm. Happens automatically if a pnpm-lock.yaml file exists.

**-d, --debug**
> Show extra debugging output.

**--** _ARGS_
> Forward all following arguments to the test script.

# DESCRIPTION

**zapier-platform test** runs the "test" script from your package.json. It is a wrapper around `npm test` that also validates the structure of your integration and sets up extra environment variables such as **ZAPIER_BASE_ENDPOINT** and, when you are logged in, **ZAPIER_DEPLOY_KEY**. Use it to validate triggers, actions, and authentication before deploying your integration.

# CAVEATS

The legacy **zapier** binary was removed in CLI v19; the command is now **zapier-platform**. Test runner flags such as **--grep** or **--timeout** are not options of this command and must be passed after **--**. Which flags apply depends on the test framework your integration uses, such as Jest or Mocha.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-validate](/man/zapier-validate)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://github.com/zapier/zapier-platform/blob/main/packages/cli/docs/cli.md)```

<!-- verified: 2026-11-09 -->
