# TAGLINE

Run API requests from Bruno collections

# TLDR

**Run a single API request**

```bru run [request.bru]```

**Run all requests** in a folder

```bru run [folder/]```

**Run with a specific environment**

```bru run [folder/] --env [production]```

**Run with environment variables**

```bru run [request.bru] --env-var [API_KEY=secret]```

**Generate JSON, JUnit, and HTML reports**

```bru run [folder/] --reporter-json [results.json] --reporter-junit [results.xml] --reporter-html [results.html]```

**Import an OpenAPI spec** as a Bruno collection

```bru import openapi --source [api.yml] --output [~/collections] --collection-name [MyAPI]```

**Run and stop on first failure**

```bru run [folder/] --env [staging] --bail```

**Run with custom CA certificate**

```bru run [request.bru] --cacert [/path/to/ca.crt]```

**Run requests recursively** through a folder

```bru run [folder/] -r```

**Run only tagged** requests

```bru run [folder/] --tags [smoke,api] --exclude-tags [slow]```

**Run once per row** of a CSV file

```bru run [folder/] --csv-file-path [data.csv]```

**Generate HTML documentation** for a collection

```bru docs generate --output [docs.html]```

# SYNOPSIS

**bru** **run** [_paths..._] [_options_]

**bru** **import** _openapi_|_wsdl_ [_options_]

**bru** **docs** **generate** [_options_]

# PARAMETERS

**--env** _name_
> Use a specific environment for the run.

**--env-var** _key=value_
> Overwrite a single environment variable. Can be used multiple times.

**--global-env** _name_
> Use a global (workspace-level) environment.

**--global-env-var** _key=value_
> Overwrite a single global environment variable. Requires **--global-env**.

**-o**, **--output** _file_
> Write results to a file.

**-f**, **--format** _format_
> Format of the results file: json (default), junit or html.

**--reporter-json** _file_
> Output results in JSON format.

**--reporter-junit** _file_
> Output results in JUnit XML format.

**--reporter-html** _file_
> Output results in HTML format.

**--reporter-skip-all-headers**, **--reporter-skip-body**
> Omit headers or bodies from the reporter output.

**--cacert** _path_
> Path to a CA certificate file for HTTPS requests.

**--ignore-truststore**
> Use only the **--cacert** certificate and ignore the default truststore.

**--client-cert-config** _file_
> Path to a client certificate configuration file.

**--noproxy**
> Disable all proxy settings.

**--insecure**
> Skip SSL certificate verification.

**-r**, **--recursive**
> Recursively run requests in subfolders.

**--bail**
> Stop execution after a failed request, test, or assertion.

**--sandbox** _mode_
> JavaScript execution mode: safe (default) or developer.

**--parallel**
> Run requests in parallel order instead of sequentially.

**--tags** _tags_, **--exclude-tags** _tags_
> Run only, or skip, requests with any of the comma-separated tags.

**--iteration-count** _number_
> Number of times to run the collection.

**--json-file-path** _file_
> Run the collection with data from a JSON file.

**--verbose**
> Allow verbose output for debugging.

**--delay** _ms_
> Delay between requests in milliseconds.

**--tests-only**
> Execute only requests containing tests or active assertions.

**--csv-file-path** _file_
> Run collection once for each row in a CSV file.

**--env-file** _file_
> Path to an environment file (.bru or .json).

**-s**, **--source** _path_
> For **import**: path or URL of the specification.

**-o**, **--output** _dir_, **-f**, **--output-file** _file_
> For **import**: write a collection directory, or a single JSON export.

**-n**, **--collection-name** _name_
> For **import**: name of the imported collection.

**-g**, **--group-by** _tags_|_path_
> For **import openapi**: how to group the requests.

# DESCRIPTION

**bru** is the command-line interface for Bruno, an open-source API client similar to Postman or Insomnia. Bruno stores API collections directly in the filesystem using plain text .bru files, making them version-control friendly.

The CLI enables headless execution of API requests for CI/CD pipelines, automated testing, and scripted operations. Collections can be stored alongside code repositories for easy collaboration.

# CAVEATS

Requires Node.js runtime. Install with **npm install -g @usebruno/cli**. Starting from CLI v3.0.0, the default runtime is Safe Mode; use **--sandbox=developer** to enable external npm packages and filesystem access. The CLI works with Bruno collection folders containing .bru files and optional environment configurations.

# HISTORY

Bruno was created as a lightweight, open-source alternative to proprietary API clients. The project emphasizes storing collections as code in plain text format for better Git integration and developer workflows.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [newman](/man/newman)(1)

# RESOURCES

```[Source code](https://github.com/usebruno/bruno)```

```[Homepage](https://www.usebruno.com)```

```[Documentation](https://docs.usebruno.com/bru-cli/overview)```

<!-- verified: 2026-11-09 -->
