# TAGLINE

Wait for services to become available

# TLDR

**Wait for a TCP port** to accept connections

```wait4x tcp [localhost:8080]```

**Wait for an HTTP endpoint** to return a specific status code

```wait4x http [https://api.example.com/health] --expect-status-code [200]```

**Wait for multiple services** in parallel

```wait4x tcp [127.0.0.1:5432] [127.0.0.1:6379] [127.0.0.1:27017]```

**Wait for a service and then run a command**

```wait4x tcp [localhost:3306] -- [./start-app.sh]```

**Wait for a DNS record** to resolve

```wait4x dns A [example.com] --expected-ip [93.184.216.34]```

**Wait for PostgreSQL** to be ready

```wait4x postgresql 'postgres://[user]:[password]@[localhost]:5432/[mydb]?sslmode=disable'```

**Wait for Redis** with key validation

```wait4x redis redis://[localhost]:6379 --expect-key "[status]=^ready$"```

**Wait for a service to become unavailable**

```wait4x tcp [localhost:8080] --invert-check```

# SYNOPSIS

**wait4x** _command_ [_options_] [_targets_] [**--** _command_]

# SUBCOMMANDS

**tcp** _address..._
> Wait for TCP port to accept connections.

**http** _url..._
> Wait for HTTP endpoint with response validation.

**dns** _type_ _name_
> Wait for DNS record resolution (A, AAAA, CNAME, MX, NS, TXT).

**mysql** _dsn_
> Wait for MySQL database readiness.

**postgresql** _dsn_
> Wait for PostgreSQL availability.

**mongodb** _uri_
> Wait for MongoDB connection.

**redis** _uri_
> Wait for Redis availability with optional key checks.

**rabbitmq** _uri_
> Wait for RabbitMQ message broker.

**kafka** _uri..._
> Wait for Kafka broker readiness.

**influxdb** _url_
> Wait for InfluxDB service.

**temporal** _subcommand_
> Wait for Temporal workflow engine (server or worker).

**exec** _command_
> Execute shell command and check exit code.

# PARAMETERS

**--timeout** _duration_
> Maximum wait duration (e.g., 30s).

**--interval** _duration_
> Check frequency (default: 1s).

**--invert-check**
> Wait for service to become unavailable instead.

**--backoff-policy** _policy_
> Retry strategy (e.g., exponential).

**--backoff-exponential-coefficient** _n_
> Multiplier per retry (e.g., 2.0).

**--backoff-exponential-max-interval** _duration_
> Maximum interval between retries.

**--expect-status-code** _code_
> Expected HTTP response code (http subcommand).

**--expect-body-regex** _pattern_
> Pattern match in HTTP response body.

**--expect-body-json** _path_
> JSON path validation using GJSON syntax.

**--expect-body-xpath** _expression_
> XPath evaluation on HTML/XML response.

**--expect-header** _header=value_
> Expected HTTP response header.

**--request-header** _header_
> Custom HTTP request header (repeatable).

**--expect-key** _key_
> Expected Redis key, optionally with value regex (key=regex).

**--expect-table** _table_
> Expected database table (mysql/postgresql subcommands).

**--expected-ip** _ip_
> Expected IP address for DNS A/AAAA records.

**--expected-domain** _domain_
> Expected domain for DNS CNAME/MX records.

**-n** _server_
> DNS nameserver to query.

# DESCRIPTION

**wait4x** is a lightweight, zero-dependency tool for waiting until services reach a ready state. It supports TCP, HTTP, DNS, and direct integrations with databases and message brokers including MySQL, PostgreSQL, MongoDB, Redis, RabbitMQ, Kafka, InfluxDB, and Temporal.

Multiple targets can be specified to check services in parallel. The **--invert-check** flag reverses the logic to wait for services to become unavailable. After a successful check, an arbitrary command can be executed by appending **--** followed by the command.

wait4x supports configurable timeouts, retry intervals, and exponential backoff strategies, making it suitable for CI/CD pipelines, container orchestration, deployment scripts, and local development environments.

# CAVEATS

Database and broker connection strings are passed as command-line arguments, which may expose credentials in process listings. Use environment variables or secrets management in production. The tool exits with a non-zero status on timeout, so scripts should handle this accordingly.

# HISTORY

**wait4x** was created as a modern, single-binary alternative to shell-based wait scripts and tools like **wait-for-it** and **dockerize**. Written in **Go**, it expanded beyond simple TCP/HTTP checks to include native protocol support for popular databases and message brokers. The project is actively maintained and available via Homebrew, Alpine packages, AUR, NixOS, and Docker.

# SEE ALSO

[nc](/man/nc)(1), [curl](/man/curl)(1), [timeout](/man/timeout)(1)
