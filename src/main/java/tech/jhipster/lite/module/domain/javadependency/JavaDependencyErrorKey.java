package tech.jhipster.lite.module.domain.javadependency;

import tech.jhipster.lite.error.domain.ErrorKey;

enum JavaDependencyErrorKey implements ErrorKey {
  UNKNOWN_DEPENDENCY("unknown-java-dependency");

  private final String key;

  JavaDependencyErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}