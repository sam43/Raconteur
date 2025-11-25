# Clean Architecture Setup

Layers:
- core: Shared utilities (Result, DispatcherProvider, Failure, base abstractions)
- domain: Business logic (entities, repository interfaces, use cases)
- data: Data sources (remote APIs, local persistence) implements domain contracts
- app: Presentation (UI, DI startup)

Dependency Direction:
app -> domain, data, core
 data -> domain, core
 domain -> core
 core -> (no layer dependencies)

DI: Koin modules per layer.

Add new features by:
1. Define domain model + repository contract in domain.
2. Implement data sources + repository in data.
3. Expose use cases in domain and inject into presentation.
4. Wire new bindings in respective Koin module.

