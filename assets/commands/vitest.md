# TAGLINE

Vite-native JavaScript testing framework

# TLDR

**Run tests** in watch mode (default in development)

```vitest```

**Run tests once** and exit

```vitest run```

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

**vitest** [**run**|**watch**|**bench**] [_options_] [_filters_...]

# PARAMETERS

**run**
> Run tests once without watch mode.

**watch**
> Run tests in watch mode, re-running on file changes.

**bench**
> Run benchmark tests.

**--coverage**
> Enable code coverage reporting (v8 or istanbul).

**-t**, **--testNamePattern** _pattern_
> Run only tests with names matching the pattern.

**--ui**
> Open the Vitest UI in a browser for interactive test viewing.

**-u**, **--update**
> Update snapshot files.

**--reporter** _name_
> Specify reporter: default, verbose, dot, json, junit.

**--config** _file_
> Path to config file.

**--root** _dir_
> Root directory for the project.

**--environment** _env_
> Test environment: node, jsdom, happy-dom.

**--threads**
> Enable multi-threading (default: true).

**--browser**
> Run tests in browser mode.

**--passWithNoTests**
> Exit successfully even if no tests are found.

**--bail** _n_
> Stop after n test failures.

# DESCRIPTION

**Vitest** is a next-generation JavaScript/TypeScript testing framework powered by Vite. It provides fast test execution through native ES module support, intelligent watch mode similar to HMR, and a Jest-compatible API for easy migration.

The framework shares Vite's configuration, transformers, resolvers, and plugins, allowing tests to use the same setup as the application. It supports DOM mocking via JSDOM or happy-dom, component testing for Vue, React, Svelte, and other frameworks, and browser-based testing.

Vitest automatically enters watch mode in development environments and run mode in CI. Configuration can be placed in vitest.config.ts or within the existing vite.config.ts under the test property. Built-in features include snapshot testing, mocking with Tinyspy, and code coverage via v8 or istanbul.

# CAVEATS

Requires Node.js 18 or higher. Watch mode may have high CPU usage on large projects; configure ignore patterns appropriately. Some Jest features have slightly different implementations. Browser mode requires additional setup.

# HISTORY

**Vitest** was created by **Anthony Fu** and the **Vite** team, with the first stable release in **December 2022**. It was designed to address the need for a testing framework that natively integrates with Vite's development server and build pipeline. The project rapidly gained adoption as the recommended testing solution for Vite-based applications.

# SEE ALSO

[jest](/man/jest)(1), [mocha](/man/mocha)(1), [npm](/man/npm)(1), [vite](/man/vite)(1)
