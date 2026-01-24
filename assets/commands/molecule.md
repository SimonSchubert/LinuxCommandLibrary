# TLDR

**Initialize new role with Molecule**

```molecule init role [role_name]```

**Create test scenario**

```molecule init scenario```

**Run full test sequence**

```molecule test```

**Create test instances**

```molecule create```

**Run playbook against instances**

```molecule converge```

**Verify instance state**

```molecule verify```

**Login to instance**

```molecule login```

**Destroy test instances**

```molecule destroy```

# SYNOPSIS

**molecule** _command_ [_--scenario-name name_] [_--driver-name driver_] [_options_]

# PARAMETERS

**init role** _NAME_
> Create new Ansible role with Molecule.

**init scenario**
> Add scenario to existing role.

**test**
> Run full test sequence.

**create**
> Create instances.

**converge**
> Run playbook.

**verify**
> Run verification tests.

**destroy**
> Destroy instances.

**login** [_HOST_]
> Login to instance shell.

**list**
> List instances and status.

**lint**
> Run linters.

**cleanup**
> Run cleanup playbook.

**-s** _NAME_, **--scenario-name** _NAME_
> Target scenario.

**-d** _NAME_, **--driver-name** _NAME_
> Driver: docker, podman, delegated, vagrant.

**--all**
> Run against all scenarios.

**--parallel**
> Run scenarios in parallel.

**--destroy** _WHEN_
> When to destroy: always, never, passing.

# DESCRIPTION

**Molecule** is a testing framework for Ansible roles. It creates test instances, runs playbooks against them, verifies results, and cleans up - enabling test-driven infrastructure development.

A scenario defines how to test a role: which driver creates instances, which playbooks run, and which verifier checks results. Default scenarios use Docker but Podman, Vagrant, and cloud providers are supported.

The test sequence runs: lint, cleanup, destroy, dependency, syntax, create, prepare, converge, idempotence, verify, cleanup, destroy. Individual stages can run separately during development.

Verification typically uses Ansible's assert module or Testinfra for Python-based tests. Tests check that the role achieved the desired state: files exist, services run, configurations are correct.

Idempotence testing runs the playbook twice, failing if changes occur on the second run. This ensures roles are properly idempotent.

CI integration works with GitHub Actions, GitLab CI, and other platforms. The test command returns appropriate exit codes for automation.

# CAVEATS

Docker/Podman required for containerized testing. Some roles need privileged containers. Windows testing is limited. Large test matrices can be slow. Cloud drivers incur costs. Systemd in containers needs special setup.

# HISTORY

**Molecule** was created by **Cisco** engineers and released around **2015** to improve Ansible role testing. Red Hat later adopted the project. It replaced ad-hoc testing approaches with a structured framework, becoming the de facto standard for Ansible role testing.

# SEE ALSO

[ansible](/man/ansible)(1), [ansible-lint](/man/ansible-lint)(1), [testinfra](/man/testinfra)(1), [docker](/man/docker)(1)
