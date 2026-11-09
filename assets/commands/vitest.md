# TAGLINE

Vite-native JavaScript testing framework

# TLDR

**Run tests** in watch mode (default in development)

```vitest```

**Run tests once** and exit

```vitest run```

**Run only the tests in one file at a given line**

```vitest run [path/to/test.spec.ts]:[10]```

**Run only tests affected by uncommitted changes**

```vitest run --changed```

**Run tests that cover the given source files**

```vitest related --run [src/index.ts]```

**Run tests with coverage**

```vitest --coverage```

**Run specific test files**

```vitest [path/to/test.spec.ts]```

**Run tests matching a pattern**

```vitest -t "[pattern]"```

**Run tests in a specific directory**

```vitest [path/to/tests]```

**Run in UI mode** (browser-based interface)

```vitest --ui```

**Update snapshots**

```vitest -u```

# SYNOPSIS

**vitest** [**run**|**watch**|**dev**|**related**|**bench**|**init**|**list**] [_options_] [_filters_...]

# PARAMETERS

**run**
> Run tests once without watch mode.

**watch**
> Run tests in watch mode, re-running on file changes.

**dev**
> Alias of **watch**.

**related** _files_...
> Run only tests that cover the given source files (static imports only).

**bench**
> Run benchmark tests.

**init** **browser**
> Set up project configuration for browser mode.

**list**
> Print matching tests without running them; supports **--json** and **--filesOnly**.

**--coverage**
> Enable code coverage reporting (v8 or istanbul).

**-t**, **--testNamePattern** _pattern_
> Run only tests with names matching the pattern.

**--ui**
> Open the Vitest UI in a browser for interactive test viewing.

**-u**, **--update** [_type_]
> Update snapshot files (accepts a boolean, new, all or none).

**-w**, **--watch**
> Enable watch mode.

**--run**
> Disable watch mode.

**--changed** [_since_]
> Run tests affected by changed files.

**--reporter** _name_
> Specify reporter: default, agent, minimal, blob, verbose, dot, json, tap, tap-flat, junit, tree, hanging-process, github-actions.

**-c**, **--config** _file_
> Path to config file.

**-r**, **--root** _dir_
> Root directory for the project.

**--dir** _dir_
> Base directory to scan for test files.

**-p**, **--project** _name_
> Run only the named workspace project; may be repeated and accepts wildcards.

**--shard** _index_/_count_
> Run one shard of the test suite.

**--environment** _env_
> Test environment: node, jsdom, happy-dom.

**--pool** _pool_
> Worker pool, such as forks or threads (default: forks).

**--maxWorkers** _n_
> Maximum number or percentage of workers.

**--retry** _times_
> Retry failing tests (default: 0).

**--browser**
> Run tests in browser mode.

**--passWithNoTests**
> Exit successfully even if no tests are found.

**--bail** [_n_]
> Stop after n test failures (default: 0, disabled).

# DESCRIPTION

**Vitest** is a next-generation JavaScript/TypeScript testing framework powered by Vite. It provides fast test execution through native ES module support, intelligent watch mode similar to HMR, and a Jest-compatible API for easy migration.

The framework shares Vite's configuration, transformers, resolvers, and plugins, allowing tests to use the same setup as the application. It supports DOM mocking via JSDOM or happy-dom, component testing for Vue, React, Svelte, and other frameworks, and browser-based testing.

Vitest automatically enters watch mode in development environments and run mode in CI. Configuration can be placed in vitest.config.ts or within the existing vite.config.ts under the test property. Built-in features include snapshot testing, mocking through the **vi** utility, and code coverage via v8 or istanbul.

# CAVEATS

Current releases require Node.js 22.12 or higher and an installed **@vitest/coverage-v8** or **@vitest/coverage-istanbul** package for coverage. Watch mode may have high CPU usage on large projects; configure ignore patterns appropriately. Some Jest features have slightly different implementations. Browser mode requires additional setup.

# HISTORY

**Vitest** was created by **Anthony Fu** and the **Vite** team, with the first public releases in **early 2022** and version **1.0** in **December 2023**. It was designed to address the need for a testing framework that natively integrates with Vite's development server and build pipeline. The project rapidly gained adoption as the recommended testing solution for Vite-based applications.

# SEE ALSO

[jest](/man/jest)(1), [mocha](/man/mocha)(1), [npm](/man/npm)(1), [vite](/man/vite)(1)

# RESOURCES

```[Source code](https://github.com/vitest-dev/vitest)```

```[Homepage](https://vitest.dev/)```

```[Documentation](https://vitest.dev/guide/cli)```

<!-- verified: 2026-11-09 -->
