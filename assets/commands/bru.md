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

**Run with custom CA certificate**

```bru run [request.bru] --cacert [/path/to/ca.crt]```

# SYNOPSIS

**bru** **run** [_paths..._] [_options_]

**bru** **import** _format_ [_options_]

# PARAMETERS

**--env** _name_
> Use a specific environment for the run.

**--env-var** _key=value_
> Set environment variables for the run.

**--reporter-json** _file_
> Output results in JSON format.

**--reporter-junit** _file_
> Output results in JUnit XML format.

**--reporter-html** _file_
> Output results in HTML format.

**--cacert** _path_
> Path to a CA certificate file for HTTPS requests.

**--insecure**
> Skip SSL certificate verification.

**-r**, **--recursive**
> Recursively run requests in subfolders.

# DESCRIPTION

**bru** is the command-line interface for Bruno, an open-source API client similar to Postman or Insomnia. Bruno stores API collections directly in the filesystem using plain text .bru files, making them version-control friendly.

The CLI enables headless execution of API requests for CI/CD pipelines, automated testing, and scripted operations. Collections can be stored alongside code repositories for easy collaboration.

# CAVEATS

Requires Node.js runtime. Install with **npm install -g @usebruno/cli**. The CLI works with Bruno collection folders containing .bru files and optional environment configurations.

# HISTORY

Bruno was created as a lightweight, open-source alternative to proprietary API clients. The project emphasizes storing collections as code in plain text format for better Git integration and developer workflows.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [newman](/man/newman)(1)
