# TLDR

**Run load test with web UI**

```locust -f [locustfile.py]```

**Run headless with specified users and spawn rate**

```locust -f [locustfile.py] --headless -u [100] -r [10] -t [5m]```

**Specify target host**

```locust -f [locustfile.py] --host [https://example.com]```

**Run as distributed master**

```locust -f [locustfile.py] --master```

**Run as distributed worker**

```locust -f [locustfile.py] --worker --master-host [master_ip]```

**Export results to CSV**

```locust -f [locustfile.py] --headless --csv [results] -u [50] -r [5] -t [2m]```

**Run with custom web UI port**

```locust -f [locustfile.py] --web-port [8089]```

**Run specific user classes**

```locust -f [locustfile.py] [UserClass1] [UserClass2]```

# SYNOPSIS

**locust** [_-f locustfile_] [_--headless_] [_-u users_] [_-r rate_] [_-t time_] [_--host url_] [_options_] [_UserClass ..._]

# PARAMETERS

**-f**, **--locustfile** _FILE_
> Path to Python locustfile (default: locustfile.py).

**-H**, **--host** _URL_
> Host to load test.

**-u**, **--users** _NUM_
> Peak number of concurrent users.

**-r**, **--spawn-rate** _NUM_
> Users spawned per second.

**-t**, **--run-time** _TIME_
> Stop after specified time (e.g., 300s, 5m, 1h).

**--headless**
> Run without web UI.

**--autostart**
> Start test immediately without waiting.

**--autoquit** _SECONDS_
> Quit after test completes (headless mode).

**--web-host** _HOST_
> Host for web interface (default: all interfaces).

**--web-port** _PORT_
> Port for web interface (default: 8089).

**--master**
> Run as distributed master node.

**--worker**
> Run as distributed worker node.

**--master-host** _HOST_
> Master node hostname (for workers).

**--master-port** _PORT_
> Master node port (default: 5557).

**--expect-workers** _NUM_
> Wait for workers before starting (master only).

**--csv** _PREFIX_
> Export results to CSV files with prefix.

**--html** _FILE_
> Generate HTML report.

**--json**
> Output results as JSON.

**--loglevel** _LEVEL_
> Log level: DEBUG, INFO, WARNING, ERROR.

**--exit-code-on-error** _CODE_
> Exit code when errors occur.

**-L**, **--list**
> List available user classes.

# DESCRIPTION

**Locust** is an open-source load testing tool written in Python. It allows you to define user behavior in Python code, making tests flexible and version-controllable. Users are simulated as greenlets (lightweight threads), enabling thousands of concurrent users on a single machine.

Tests are defined in a locustfile containing user classes. Each user class defines tasks (HTTP requests or other operations) with optional weights for probability. The **@task** decorator marks methods as tasks, and **between()** sets wait times between requests.

The web UI (default port 8089) provides real-time statistics, charts, and controls. You can start/stop tests, adjust user counts, and download results. For CI/CD integration, headless mode runs without the UI.

Distributed mode scales across multiple machines. One master coordinates workers, aggregating statistics and controlling the test. Workers simulate users and report back. This enables millions of requests per second from commodity hardware.

Locust supports custom protocols beyond HTTP through custom clients. The event system allows hooks for custom logging, metrics, and integration with monitoring systems.

# CAVEATS

Python-based tests require Python knowledge. Greenlets aren't true threads - CPU-bound tasks block other users. For maximum performance, use multiple worker processes or machines. Web UI should be protected in production environments. Memory usage grows with user count.

# HISTORY

**Locust** was created by **Jonatan Heyman** starting around **2011** as an alternative to Java-based load testing tools like JMeter. The philosophy was "load testing as code" - using a real programming language rather than XML configuration. Named after the locust swarm metaphor, it gained popularity for its simplicity and the ability to define complex user scenarios in Python. The project is actively maintained with regular releases.

# SEE ALSO

[ab](/man/ab)(1), [wrk](/man/wrk)(1), [hey](/man/hey)(1), [siege](/man/siege)(1), [vegeta](/man/vegeta)(1)
