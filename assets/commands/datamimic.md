# TAGLINE

deterministic synthetic test-data generator and XML pipeline runner

# TLDR

**Install** the Community Edition and print the version

```pip install datamimic-ce```

```datamimic version```

**Create** a new project with a starter descriptor

```datamimic init [my-scenario]```

**Run** the default `datamimic.xml` in the current directory

```datamimic run```

Run a **named XML descriptor**

```datamimic run [path/to/datamimic.xml]```

**Lint** a descriptor (rule ids and fix hints; JSON for CI)

```datamimic lint [path/to/datamimic.xml]```

```datamimic lint [path/to/datamimic.xml] --format json```

**Dry-run** with bounded counts and neutralized file/DB targets

```datamimic dry-run [path/to/datamimic.xml] --format json```

Compile and verify an **intent model** (`model.dm.json`)

```datamimic scaffold [model.dm.json] --format json```

Dump the live **DSL surface** as JSON

```datamimic capabilities```

Query a **reference topic**

```datamimic reference overview```

```datamimic reference authoring --category field --kind weighted```

**List** packaged demos and copy one out

```datamimic demo list```

```datamimic demo create demo-healthcare```

# SYNOPSIS

**datamimic** [_command_] [_options_]

**datamimic** **run** [_descriptor_] [**--platform-configs** _json_] [**--task-id** _id_] [**--test-mode**]

**datamimic** **lint** _descriptor_ [**-f** _text_|_json_] [**--fail-on** _error_|_warning_] [**--max-diagnostics** _n_]

**datamimic** **dry-run** _descriptor_ [**--max-count** _n_] [**--sample-rows** _n_] [**--timeout** _seconds_] [**--allow-side-effects**] [**--smoke-export**] [**-f** _text_|_json_]

**datamimic** **scaffold** _spec_ [**--format** _text_|_json_] [**--max-count** _n_] [**--sample-rows** _n_] [**--acceptance-requirements** _file_] [**--smoke-export**] [**--deterministic-replay**]

**datamimic** **init** _name_ [**-t** _dir_] [**-f**]

**datamimic** **capabilities** [**--section** _names_] [**--full**]

**datamimic** **reference** _topic_ [_name_] [**--category** _cat_] [**--kind** _kind_]

**datamimic** **demo** **list** | **info** _name_ | **create** [_name_] [**-t** _dir_] [**-o**] [**--all**]

**datamimic** **info** | **version**

# PARAMETERS

**run** [_descriptor_]
> Execute a DATAMIMIC XML descriptor for real. Default path is **datamimic.xml**. The process **chdir**s to the descriptor's parent directory for the run, then restores the original cwd.

**--platform-configs** _json_
> JSON object of platform configuration values passed into the engine.

**--task-id** _id_
> Optional task identifier recorded on the run.

**--test-mode**
> Run the engine in test mode.

**lint** _descriptor_
> Check one XML descriptor for schema, semantics, and best-practice rules. Each finding has a rule id (**DMxxx**) and a fix hint.

**-f**, **--format** _text_|_json_
> Human text (default) or machine-readable JSON. Applies to **lint**, **dry-run**, and **scaffold**. **capabilities** always prints JSON.

**--fail-on** _error_|_warning_
> With **lint**, severity that makes the process exit **1**. Default **error**. **warning** also fails on warnings.

**--max-diagnostics** _n_
> Cap the number of lint diagnostics (default 200, range 1–200).

**dry-run** _descriptor_
> Bounded, target-neutralized execution: sample rows without writing real file or database targets unless **--allow-side-effects** is set.

**--max-count** _n_
> Per-`<generate>` record cap for **dry-run** and **scaffold** (default 10, range 1–1000). Nested generates share the cap.

**--sample-rows** _n_
> Sample rows captured per product (default 5, range 1–50).

**--timeout** _seconds_
> Dry-run wall-clock limit (default 30, range 1–120).

**--allow-side-effects**
> Keep file/DB targets and allow `<execute>` during a dry-run. Default is neutralized.

**--smoke-export**
> Push captured rows through file exporters in a temp directory (no kept artifacts) to catch serialization crashes. Also available on **scaffold**.

**scaffold** _spec_
> Compile, lint, bounded-run, and accept one **model.dm.json** intent document. Use **-** to read the spec from stdin. Stop when the JSON result has **verified=true**; generated XML is runtime output, not a second source of truth.

**--acceptance-requirements** _file_
> Extra JSON array of caller-owned assertions for this scaffold transaction. They are evaluated but not written back into the spec.

**--deterministic-replay**
> With **scaffold**, run the same seeded bounded model a second time and compare captured rows.

**init** _name_
> Create a project directory with a starter layout. Name may contain letters, numbers, underscores, and dashes only.

**-t**, **--target** _dir_
> Parent directory for **init** or **demo create**. **demo create --all** requires this.

**-f**, **--force**
> With **init**, overwrite an existing project directory.

**capabilities**
> Print the live DSL surface as JSON. Default is a compact index.

**--full**
> Emit the complete capabilities manifest.

**--section** _names_
> Comma-separated manifest sections (for example **elements,rules**).

**reference** _topic_ [_name_]
> Query model, rule, and authoring reference data. Topics: **overview**, **element**, **generators**, **entities**, **context**, **timeseries**, **targets**, **distributions**, **converters**, **rules**, **scaffold**, **authoring**. **authoring** uses **--category** / **--kind** instead of _name_.

**--category** _product_|_source_|_field_|_target_|_expectation_
> Authoring-reference listing. Only valid with topic **authoring**.

**--kind** _kind_
> Typed fragment within that category (for example **weighted**, **memstore**).

**demo list**
> List packaged demo projects.

**demo info** _name_
> Show one demo's metadata (description, dependencies, usage).

**demo create** [_name_]
> Copy a packaged demo into the working directory (or **--target**). **--all** copies every demo and requires **--target**. **-o** / **--overwrite** replaces existing files.

**info**
> Print version, Python, OS, config path, output directory, and log level.

**version**
> Print the DATAMIMIC library version.

# DESCRIPTION

**datamimic** is the command-line front end for DATAMIMIC Community Edition (CE), a Python engine that generates deterministic synthetic test data and can pseudonymize staging exports. Pipelines are XML descriptors (`<setup>`, `<generate>`, `<variable>`, `<key>`). New models can also be authored as **model.dm.json** and compiled with **scaffold**.

Install the CE package with **pip install datamimic-ce** (Python **3.10+**). The same wheel exposes **datamimic-mcp** when the optional **mcp** extra is installed (`pip install "datamimic-ce[mcp]"`), mapping **reference**, **scaffold**, **lint**, and **dry-run** to MCP tools.

CE targets local, CI, and agent workflows: CSV, JSON, XML, XLSX, DbUnit, fixed-width (**.fcw**), SQLite, PostgreSQL, MySQL, Oracle, MS SQL, and MongoDB. Domain services cover people, addresses, healthcare, finance, insurance, e-commerce, and public-sector entities. The same seed plus the same model and engine version is specified to replay byte-identical output. Set **rngSeed** on `<setup>` or a `<variable>` for that contract; omit it for a non-reproducible, privacy-maximized transformation.

A typical XML path is **lint** → **dry-run** → **run**. **run** is the production engine: it changes into the descriptor directory, optionally loads **conf/environment.env.properties**, and writes real targets. **dry-run** caps counts and strips targets so a bad model cannot fill a database. **scaffold** is the agent-oriented path: one compile/lint/bounded-run/acceptance transaction per changed **model.dm.json**.

The Enterprise Platform (EE) is a separate commercial product with a UI, PII scanner, RBAC, scheduler, and a different execution engine. This page documents the open-source **datamimic** CLI from the CE package.

# ENVIRONMENT

**DATAMIMIC_CONFIG**
> Config file shown by **datamimic info**. Unset displays as Default.

**DATAMIMIC_OUTPUT_DIR**
> Output directory shown by **info**. Unset means the current directory.

**DATAMIMIC_LOG_LEVEL**
> Log level (default **INFO**).

# FILES

**datamimic.xml**
> Default descriptor path for **datamimic run**.

**model.dm.json**
> Canonical intent document for **datamimic scaffold**. Top-level keys are **version**, **seed**, **products**, and **expectations**.

**conf/environment.env.properties**
> Optional environment properties loaded from the descriptor's parent directory on **run**. Missing file is ignored.

# EXIT CODES

**0**
> Success. For **scaffold**, also requires **verified=true**. For **lint**, no diagnostics at or above **--fail-on**. For **dry-run**, **ok** is true.

**1**
> Failed run, failed or unverified scaffold (after render), lint findings at the chosen threshold, or a usage error such as a missing descriptor or invalid project name.

**2**
> Hard failure: **scaffold** render error, or presenter **fail()** default (bad JSON flags, and similar).

# CAVEATS

The PyPI distribution is **datamimic-ce**, not **datamimic**. A global **datamimic** on PATH can be an older install; in a checkout use **.venv/bin/datamimic**.

**run** writes real files and databases. Point **source** at a controlled export or staging copy, never a live production connection. **dry-run** without **--allow-side-effects** is the safe preview.

CE identifies PII fields by hand in the XML model. Seeded mode is reproducible (same source row maps to the same synthetic value when **distribution="ordered"**). Unseeded mode is non-deterministic by design. The project does not claim GDPR anonymization on a whole dataset.

CE is a Python multiprocess engine sized for millions of records. Coordinated multi-system runs, Kafka, and billion-record throughput are EE.

A `<key name="ts">` or `<variable name="ts">` shadows the time-series namespace (**ts.now**, **ts.step**, **ts.series**). Name the output column something else, for example **timestamp**.

# HISTORY

**rapiddweller** (Hamburg / Asia) has shipped model-driven test data since **Benerator** in **2006**. DATAMIMIC Community Edition is the Python successor to that XML-descriptor engine. CE was released under the **MIT License** in **December 2024**. Version **3.0.0** added first-class time-series `<generate start/end/interval>` loops; **4.0.0** extended setup-level **rngSeed** to standalone literal generators.

# SEE ALSO

[faker](/man/faker)(1), [fakedata](/man/fakedata)(1), [python](/man/python)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/rapiddweller/datamimic)```

```[Homepage](https://datamimic.io)```

```[Documentation](https://docs.datamimic.io)```

<!-- verified: 2026-09-16 -->
