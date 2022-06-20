package tech.jhipster.lite.generator.module.domain.packagejson;

import java.util.Collection;
import java.util.stream.Stream;
import tech.jhipster.lite.common.domain.JHipsterCollections;

public record PackageJsonDependencies(Collection<PackageJsonDependency> dependencies) {
  public PackageJsonDependencies(Collection<PackageJsonDependency> dependencies) {
    this.dependencies = JHipsterCollections.immutable(dependencies);
  }

  public boolean isEmpty() {
    return dependencies().isEmpty();
  }

  public Stream<PackageJsonDependency> stream() {
    return dependencies().stream();
  }
}
