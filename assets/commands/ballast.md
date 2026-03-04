# TAGLINE

Snapshot-based API load testing tool

# TLDR

**Run load tests** from the current directory using a ballast.json config

```ballast```

**Run load tests** without writing a snapshot file

```ballast --no-snapshot```

**Run load tests** with a description for the snapshot

```ballast --desc "[initial baseline]"```

# SYNOPSIS

**ballast** [**--no-snapshot**] [**--desc** _description_]

# PARAMETERS

**--no-snapshot**
> Run load tests without writing a snapshot file. Useful for one-off tests where no baseline comparison is needed.

**--desc** _description_
> Attach a description to the snapshot for identification purposes.

# DESCRIPTION

**ballast** is a command-line tool for running snapshot-based performance tests against APIs. It applies the concept of snapshot testing, commonly used in UI testing frameworks, to API load testing. A performance baseline is captured as a snapshot and subsequent test runs are compared against it to detect performance regressions.

Tests are defined in a **ballast.json** configuration file that specifies a list of endpoints to test. For each endpoint, ballast sends a configurable number of concurrent requests across multiple cycles and measures response times. It then computes average, minimum, and maximum response times and compares them against the previous snapshot. If the average response time deviates beyond a configurable threshold (default 250ms), the test is marked as failed.

Beyond response time, ballast can validate expected HTTP status codes, response bodies, and response headers. A logarithmic ramp-up phase warms the target before the main test cycles begin. Results are displayed in the terminal with color-coded output: green for passing tests and improvements, red for failures and regressions, and yellow for warnings.

Snapshots are stored in a **.ballast_snapshot.json** file in the current directory, maintaining a timestamped history of all previous test runs.

Written in Rust, ballast uses tokio for async request execution and reqwest as its HTTP client.

# CONFIGURATION

**ballast.json**
> Configuration file defining the endpoints to test. Must be present in the working directory. Contains an **endpoints** array with the following fields per endpoint:

**name** _string_
> Required. Identifier for the test.

**url** _string_
> Required. The target endpoint URL.

**method** _string_
> Required. HTTP method: GET, POST, PUT, DELETE, PATCH, or OPTIONS.

**concurrent_requests** _number_
> Required. Number of parallel requests sent per cycle.

**cycles** _number_
> Required. Number of test iterations to run.

**threshold** _number_
> Acceptable response time deviation in milliseconds (default: 250).

**headers** _object_
> Custom HTTP headers as key-value pairs.

**body** _json_
> JSON request payload for POST, PUT, or PATCH requests.

**expected_status** _number_
> Expected HTTP status code to validate against.

**expected_body** _json_
> Expected response body to validate against.

**expected_headers** _object_
> Expected response headers to validate against.

**ramp** _boolean_
> Enable logarithmic ramp-up before test cycles (default: true).

# CAVEATS

Ballast requires a **ballast.json** file in the current directory; there is no way to specify a different config file path. The tool is designed for testing local or development APIs and is not intended for production load testing at scale. A 100ms pause is inserted between cycles, which limits maximum request throughput.

# HISTORY

**ballast** was created by **Teo Nys** (synoet) as an open-source Rust project under the MIT license. It is available on crates.io and its source code is hosted on GitHub.

# SEE ALSO

[ab](/man/ab)(1), [wrk](/man/wrk)(1), [curl](/man/curl)(1), [ali](/man/ali)(1), [hey](/man/hey)(1)
