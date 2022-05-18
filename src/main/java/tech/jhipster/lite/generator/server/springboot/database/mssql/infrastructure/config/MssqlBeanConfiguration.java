package tech.jhipster.lite.generator.server.springboot.database.mssql.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.generator.buildtool.generic.domain.BuildToolService;
import tech.jhipster.lite.generator.docker.domain.DockerService;
import tech.jhipster.lite.generator.project.domain.ProjectRepository;
import tech.jhipster.lite.generator.server.springboot.common.domain.SpringBootCommonService;
import tech.jhipster.lite.generator.server.springboot.database.mssql.domain.MssqlDomainService;
import tech.jhipster.lite.generator.server.springboot.database.mssql.domain.MssqlService;
import tech.jhipster.lite.generator.server.springboot.database.sqlcommon.domain.SQLCommonService;

@Configuration
public class MssqlBeanConfiguration {

  private final BuildToolService buildToolService;
  private final SpringBootCommonService springBootCommonService;
  private final SQLCommonService sqlCommonService;
  private final DockerService dockerService;
  private final ProjectRepository projectRepository;

  public MssqlBeanConfiguration(
    BuildToolService buildToolService,
    SpringBootCommonService springBootCommonService,
    SQLCommonService sqlCommonService,
    DockerService dockerService,
    ProjectRepository projectRepository
  ) {
    this.buildToolService = buildToolService;
    this.springBootCommonService = springBootCommonService;
    this.sqlCommonService = sqlCommonService;
    this.dockerService = dockerService;
    this.projectRepository = projectRepository;
  }

  @Bean
  public MssqlService mssqlService() {
    return new MssqlDomainService(buildToolService, springBootCommonService, sqlCommonService, dockerService, projectRepository);
  }
}
