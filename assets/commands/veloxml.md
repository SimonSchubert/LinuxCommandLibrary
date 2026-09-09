# TAGLINE

deploy open-source LLMs into your own AWS or GCP account

# TLDR

**Check** that cloud credentials and compute quota are usable

```veloxml check```

**Scaffold** a FastAPI model service in the current directory

```veloxml init [my-model]```

Same, requesting a **GPU** accelerator

```veloxml init [llm-service] --gpu [T4:1]```

**Deploy** the current project (reads `veloxml.yaml` and `app.py`)

```veloxml deploy```

Validate the generated SkyPilot spec **without launching** instances

```veloxml deploy --dry-run```

Deploy to **GCP** instead of the default AWS `us-east-1`

```veloxml deploy --cloud [gcp] --region [us-central1]```

Override the **GPU** for this deploy only

```veloxml deploy --gpu [A10G:1] --verbose```

List **active services** in the cloud account

```veloxml status```

**Tail** logs for the service named in `veloxml.yaml`

```veloxml logs --follow```

Show the last **N** lines for a named service

```veloxml logs [my-model] --tail [50]```

Tear down **this** service

```veloxml down```

Tear down the service **and** every leftover SkyPilot cluster

```veloxml down --all```

Print the **CLI version**

```veloxml version```

# SYNOPSIS

**veloxml** **init** [_name_] [**-g** | **--gpu** _ACCEL_]

**veloxml** **check**

**veloxml** **deploy** [**--dry-run**] [**--cloud** _aws_|_gcp_] [**--region** _REGION_] [**-g** | **--gpu** _ACCEL_] [**-v** | **--verbose**]

**veloxml** **status**

**veloxml** **logs** [_name_] [**-t** | **--tail** _N_] [**-f** | **--follow**]

**veloxml** **down** [**-n** | **--name** _name_] [**-a** | **--all**]

**veloxml** **version**

# COMMANDS

**init** [_name_]
> Write a starter FastAPI `app.py` (health + echo `/predict`), `requirements.txt`, and `veloxml.yaml` in the current directory. _name_ defaults to **my-model-service**. Existing `app.py` / `requirements.txt` are left untouched.

**check**
> Run SkyPilot's cloud probe (`sky check`) and report whether AWS credentials and EC2 quota look usable. Fails with a hint to run `aws configure` when nothing is found.

**deploy**
> Compile `.veloxml/<name>.sky.yaml`, then `sky serve up` (or `sky serve update` if the service already exists). Polls until the replica `/health` probe returns HTTP 200 (up to 10 minutes) and prints a sample `curl` against `/predict`. Requires `veloxml.yaml` or `app.py` in the current directory.

**status**
> Parse `sky serve status` and print a table of VeloxML services (name, version, uptime, status, replicas, endpoint).

**logs** [_name_]
> Print application logs via `sky serve logs`. _name_ defaults to the `name` field in `veloxml.yaml`.

**down**
> Stop the named service with `sky serve down`. With **--all**, also run `sky down -a` to destroy leftover controller nodes and clusters.

**version**
> Print `VeloxML CLI version <x.y.z>`.

# PARAMETERS

**-g**, **--gpu** _ACCEL_
> GPU accelerator string understood by SkyPilot, e.g. **T4:1**, **A10G:1**, **L4:1**. On **init** it is stored in `veloxml.yaml`; on **deploy** it overrides the file for that run.

**--dry-run**
> **deploy** only. Write the SkyPilot spec and exit without provisioning. Prints a dummy `http://127.0.0.1:8000` endpoint.

**--cloud** _aws_|_gcp_
> **deploy** only. Target cloud. Default **aws**.

**--region** _REGION_
> **deploy** only. Cloud region. Default **us-east-1**.

**-v**, **--verbose**
> **deploy** only. Stream SkyPilot's full output and re-raise exceptions instead of collapsing them into a short error box.

**-t**, **--tail** _N_
> **logs** only. Number of trailing lines to print. Default **100**. Ignored with **--follow**.

**-f**, **--follow**
> **logs** only. Stream live logs (passes through to `sky serve logs`).

**-n**, **--name** _name_
> **down** only. Service to tear down instead of the name in `veloxml.yaml`.

**-a**, **--all**
> **down** only. After stopping the service, purge every SkyPilot cluster (`sky down -a -y`) so leftover controllers stop billing.

**--help**
> Typer help for the CLI or a subcommand. Running **veloxml** with no arguments also prints help.

# DESCRIPTION

**veloxml** is the command-line interface for **VeloxML**, a thin Python wrapper around **SkyPilot Serve**. It deploys a FastAPI (or similar) model service into **your** AWS or GCP account rather than onto a third-party inference host.

The usual loop is **init** (or hand-write `app.py` + `veloxml.yaml`), **check**, **deploy**, then **down** when finished. **deploy** generates a SkyPilot service spec under `.veloxml/`, installs `requirements.txt` plus an optional `runtime.setup` command on the VM, starts `uvicorn app:app --host 0.0.0.0 --port 8000` by default, and waits for `/health`. Re-running **deploy** against an already-running name performs a rolling `sky serve update`.

The PyPI package is **veloxml-deploy**; the console script it installs is **veloxml**. It depends on **skypilot** (the `sky` binary), **truss**, and **typer**. Python **3.10+** is required. The project is Apache-2.0 licensed.

# CONFIGURATION

**veloxml.yaml**
> Per-project spec in the working directory. Loaded by **deploy**, **logs**, and **down**; written by **init**. Missing keys take the defaults below.

**name**
> Service name passed to SkyPilot (default **my-model-service**).

**compute.cloud** / **compute.region**
> Cloud and region (defaults **aws**, **us-east-1**). Overridden by **--cloud** / **--region** on **deploy**.

**compute.accelerator**
> Optional GPU, e.g. `T4:1`. Set by **--gpu**.

**compute.cpus** / **compute.memory**
> Size floors with a trailing `+` (defaults **2+** / **4+**). Values without `+` get it appended when the spec is compiled.

**compute.use_spot**
> Request spot instances. Default **false** in the schema; README examples set **true**.

**service.port**
> Published port (default **8000**).

**service.readiness_probe** / **service.predict_path**
> HTTP paths (defaults **/health** and **/predict**). The readiness probe is given a 240 s initial delay.

**service.min_replicas** / **service.max_replicas**
> Replica policy (both default **1**). Scale-to-zero is not the compiled default; set **min_replicas** to **0** if SkyPilot should idle the service.

**runtime.app_entrypoint** / **runtime.command**
> ASGI target and the remote start command (defaults **app:app** and `uvicorn app:app --host 0.0.0.0 --port 8000`).

**runtime.setup**
> Extra shell run on the VM after `pip install -r requirements.txt` (and a best-effort CPU PyTorch install).

**.veloxml/<name>.sky.yaml**
> Generated SkyPilot Serve spec. Do not treat it as the source of truth; it is rewritten on every **deploy**.

Cloud credentials are **not** stored by VeloxML. Use `aws configure` or `gcloud auth application-default login` so SkyPilot can see them.

# CAVEATS

The repository marks itself **alpha** and warns of breaking changes. Version **0.1.1** is the package version at documentation time.

Deployments run in **your** cloud account and **cost money**. Spot instances can be reclaimed. Always **veloxml down --all** when finished; leftover SkyPilot controllers keep billing after a single-service **down**.

**check** looks for AWS in `sky check` output even though **--cloud gcp** is accepted. GCP still needs application-default credentials for **deploy** to work.

**deploy** must be run from the project directory. Without `veloxml.yaml` or `app.py` it exits 1.

The marketing site talks about scale-to-zero; the compiled replica policy defaults to **min_replicas: 1**. Setting `use_spot: true` is independent of replica count.

**logs --tail** is ignored when **--follow** is set, because follow mode execs `sky serve logs` without capturing output.

The `sky` binary must be on **PATH** (or next to the same Python that installed **veloxml-deploy**). A missing or unconfigured SkyPilot install makes every cloud subcommand fail.

# HISTORY

**VeloxML** is an Apache-2.0 Python CLI by **Pedro Águas Marques** (**paguasmar**). The public GitHub repository **paguasmar/veloxml-deploy** was created on **29 August 2026**. It wraps **SkyPilot** (UC Berkeley) for provisioning and borrows packaging conventions from **Truss**. The advertised goal is one-command LLM endpoints inside the caller's own VPC, without Dockerfiles, Kubernetes YAML, or a hosted inference vendor.

# SEE ALSO

[aws](/man/aws)(1), [gcloud](/man/gcloud)(1), [uvicorn](/man/uvicorn)(1), [pip](/man/pip)(1), [curl](/man/curl)(1), [docker](/man/docker)(1), [flyctl](/man/flyctl)(1)

# RESOURCES

```[Source code](https://github.com/paguasmar/veloxml-deploy)```

```[Homepage](https://www.veloxml.com/)```

```[Documentation](https://github.com/paguasmar/veloxml-deploy#getting-started)```

<!-- verified: 2026-09-09 -->
