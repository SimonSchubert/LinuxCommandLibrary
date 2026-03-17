# TAGLINE

Run Postman collections from the command line

# TLDR

**Run Postman collection**

```newman run [collection.json]```

**Run with environment**

```newman run [collection.json] -e [environment.json]```

**Run specific folder**

```newman run [collection.json] --folder "[folder name]"```

**Export results**

```newman run [collection.json] -r [html] --reporter-html-export [report.html]```

**Run with iterations**

```newman run [collection.json] -n [10]```

**Run with data file**

```newman run [collection.json] -d [data.csv]```

**Set timeout**

```newman run [collection.json] --timeout-request [5000]```

# SYNOPSIS

**newman** **run** _collection_ [_options_]

# PARAMETERS

_COLLECTION_
> Postman collection file path or URL.

**-e** _FILE_
> Specify an environment file.

**-g** _FILE_
> Specify a globals file.

**--folder** _NAME_
> Run only a specific folder from the collection.

**-r** _REPORTERS_
> Comma-separated reporter types (cli, json, junit, html).

**-n** _COUNT_
> Number of iterations to run.

**-d** _FILE_
> Data file (CSV or JSON) for iteration variables.

**--global-var** _KEY=VALUE_
> Set a global variable via the command line (repeatable).

**--env-var** _KEY=VALUE_
> Set an environment variable via the command line (repeatable).

**--bail**
> Stop the run on the first test failure.

**--timeout** _MS_
> Time in milliseconds to wait for the entire collection run to complete.

**--timeout-request** _MS_
> Time in milliseconds to wait for each request.

**-x**, **--suppress-exit-code**
> Override the default exit code for the run.

**--color** _VALUE_
> Control color output: on, off, or auto (default).

**--help**
> Display help information.

# DESCRIPTION

**newman** is the command-line companion for Postman that runs exported collections, enabling automated API testing. It executes all requests in a collection sequentially, running pre-request scripts and tests, and reports results.

Newman integrates with CI/CD pipelines to automate API testing. It supports data-driven testing through CSV/JSON files, multiple reporters for output formatting, and environment/global variable management.

# CAVEATS

Requires Node.js. Collections must be exported from Postman in JSON format. The HTML reporter requires an additional npm package (newman-reporter-html). Collection v1 format is deprecated; use v2 or later.

# HISTORY

Newman was created by **Postman** to enable command-line execution of API collections for testing automation.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [postman](/man/postman)(1), [npm](/man/npm)(1)

